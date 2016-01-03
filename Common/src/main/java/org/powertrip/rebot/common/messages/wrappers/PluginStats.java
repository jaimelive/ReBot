package org.powertrip.rebot.common.messages.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Jaime on 03/01/2016.
 * 06:40
 */
public class PluginStats implements Serializable {
	private String name;
	private Long timestamp;
	private String url;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public PluginStats setName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("timestamp")
	public Long getTimestamp() {
		return timestamp;
	}

	public PluginStats setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public PluginStats setUrl(String url) {
		this.url = url;
		return this;
	}
}
