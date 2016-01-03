package org.powertrip.rebot;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Created by Jaime on 03/01/2016.
 * 04:46
 */
public class ControlConfiguration extends Configuration{
	String redisHost;
	int redisPort;
	String pluginFolder;

	@JsonProperty
	public String getRedisHost() {
		return redisHost;
	}

	public ControlConfiguration setRedisHost(String redisHost) {
		this.redisHost = redisHost;
		return this;
	}

	@JsonProperty
	public int getRedisPort() {
		return redisPort;
	}

	public ControlConfiguration setRedisPort(int redisPort) {
		this.redisPort = redisPort;
		return this;
	}

	@JsonProperty
	public String getPluginFolder() {
		return pluginFolder;
	}

	public ControlConfiguration setPluginFolder(String pluginFolder) {
		this.pluginFolder = pluginFolder;
		return this;
	}
}
