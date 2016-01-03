package org.powertrip.rebot.common.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.powertrip.rebot.common.messages.wrappers.BotStats;
import org.powertrip.rebot.common.utils.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaime on 03/01/2016.
 * 05:00
 */
public class Task implements Serializable{
	private Long id;
	private Job job;
	private BotStats botStats;
	private Map<String, byte[]> parameters;

	public Task() {
		parameters = new HashMap<>();
	}

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public Task setId(Long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("job")
	public Job getJob() {
		return job;
	}

	public Task setJob(Job job) {
		this.job = job;
		return this;
	}

	@JsonProperty("bot")
	public BotStats getBotStats() {
		return botStats;
	}

	public Task setBotStats(BotStats botStats) {
		this.botStats = botStats;
		return this;
	}

	@JsonProperty("parameters")
	public Map<String, byte[]> getParameters() {
		return parameters;
	}

	public Task setParameters(Map<String, byte[]> parameters) {
		this.parameters = parameters;
		return this;
	}

	@JsonIgnore
	public <T> T getParameter(String key, Class<T> tClass) throws IOException, ClassNotFoundException {
		T object = null;
		byte[] bytes = parameters.get(key);
		if(bytes!=null) object = SerializationUtils.decodeForJSON(bytes, tClass);
		return object;
	}

	public Task setParameter(String key, Object object) throws IOException {
		parameters.put(key, SerializationUtils.encodeForJSON(object));
		return this;
	}
}
