package org.powertrip.rebot.common.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.powertrip.rebot.common.utils.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaime on 03/01/2016.
 * 05:00
 */
public class Reply implements Serializable {
	private Long taskId;
	private Long jobId;
	private Long botId;
	private Boolean successfull;
	private Map<String, byte[]> parameters;

	public Reply() {
		parameters = new HashMap<>();
	}

	@JsonProperty("taskId")
	public Long getTaskId() {
		return taskId;
	}

	public Reply setTaskId(Long taskId) {
		this.taskId = taskId;
		return this;
	}

	@JsonProperty("successfull")
	public Boolean getSuccessfull() {
		return successfull;
	}

	public Reply setSuccessfull(Boolean successfull) {
		this.successfull = successfull;
		return this;
	}

	@JsonProperty("jobId")
	public Long getJobId() {
		return jobId;
	}

	public Reply setJobId(Long jobId) {
		this.jobId = jobId;
		return this;
	}

	@JsonProperty("botId")
	public Long getBotId() {
		return botId;
	}

	public Reply setBotId(Long botId) {
		this.botId = botId;
		return this;
	}

	@JsonProperty("parameters")
	public Map<String, byte[]> getParameters() {
		return parameters;
	}

	public Reply setParameters(Map<String, byte[]> parameters) {
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

	public Reply setParameter(String key, Object object) throws IOException {
		parameters.put(key, SerializationUtils.encodeForJSON(object));
		return this;
	}
}
