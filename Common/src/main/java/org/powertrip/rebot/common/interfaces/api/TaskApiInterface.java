package org.powertrip.rebot.common.interfaces.api;

import org.powertrip.rebot.common.messages.Reply;
import org.powertrip.rebot.common.messages.Task;

/**
 * Created by Jaime on 03/01/2016.
 * 06:21
 */
public interface TaskApiInterface {
	Task getTask(Long botId);
	Reply checkIfTaskIsAlive(Long botId, Long jobId, Long taskId);
	Reply submitReply(Reply reply);
	Reply finishTask(Reply reply);
}
