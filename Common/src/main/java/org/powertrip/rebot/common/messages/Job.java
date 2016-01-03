package org.powertrip.rebot.common.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaime on 03/01/2016.
 * 05:00
 */
public class Job implements Serializable {
	private Long uuid;
	private String command;
	private Map<String, String> parameters;
	private String botSelector;
	private Long timeStamp;
	private Long timeout;


	public Job() {
		this.parameters = new HashMap<>();
	}

	@JsonProperty("uuid")
	public Long getUuid() {
		return uuid;
	}

	public Job setUuid(Long uuid) {
		this.uuid = uuid;
		return this;
	}

	@JsonProperty("command")
	public String getCommand() {
		return command;
	}

	public Job setCommand(String command) {
		this.command = command;
		return this;
	}

	@JsonProperty("parameters")
	public Map<String, String> getParameters() {
		return parameters;
	}

	public Job setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
		return this;
	}

	@JsonIgnore
	public String getParameter(String key){
		return parameters.get(key);
	}

	public Job setParameter(String key, String value){
		parameters.put(key, value);
		return this;
	}

	@JsonProperty("botSelector")
	public String getBotSelector() {
		return botSelector;
	}

	public Job setBotSelector(String botSelector) {
		this.botSelector = botSelector;
		return this;
	}

	@JsonProperty("timeout")
	public Long getTimeout() {
		return timeout;
	}

	public Job setTimeout(Long timeout) {
		this.timeout = timeout;
		return this;
	}
}
