package org.powertrip.rebot.controllers;

import org.powertrip.rebot.common.interfaces.api.TaskApiInterface;
import org.powertrip.rebot.common.interfaces.controllers.TaskControllerInterface;
import org.powertrip.rebot.common.messages.Reply;
import org.powertrip.rebot.common.messages.Task;
import org.powertrip.rebot.common.utils.SerializationUtils;
import org.powertrip.rebot.data.DataStore;
import redis.clients.jedis.Jedis;

/**
 * Created by Jaime on 03/01/2016.
 * 08:14
 */
public class TaskController implements TaskApiInterface, TaskControllerInterface{
	private static final String QUEUE_PREFIX = "TASK.QUEUE.";

	@Override
	public Task getTask(Long botId) {
		final String key = QUEUE_PREFIX + botId;
		String value;
		Task task = null;
		Jedis jedis = DataStore.getJedis();
		if(jedis == null) return null;

		while(jedis.llen(key)>0 && task==null){
			value = jedis.lindex(key, 0);
			if(value==null) continue;
			task = SerializationUtils.JsonToObject(value, Task.class);
			if (task == null) jedis.lpop(key);
		}
		jedis.close();
		return task;
	}

	@Override
	public Reply checkIfTaskIsAlive(Long botId, Long jobId, Long taskId) {
		return null;
	}

	@Override
	public Reply submitReply(Reply reply) {
		return null;
	}

	@Override
	public Reply finishTask(Reply reply) {
		return null;
	}

	@Override
	public void submitTask(Task task) {
		long taskId = task.getId();
		long botId = task.getBotStats().getId();
	}
}
