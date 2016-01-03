package org.powertrip.rebot.common.messages.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Jaime on 03/01/2016.
 * 06:43
 */
public class PluginHelp {
	PluginStats pluginStats;
	String help;
	String usage;

	@JsonProperty("plugin")
	public PluginStats getPluginStats() {
		return pluginStats;
	}

	public PluginHelp setPluginStats(PluginStats pluginStats) {
		this.pluginStats = pluginStats;
		return this;
	}

	@JsonProperty("help")
	public String getHelp() {
		return help;
	}

	public PluginHelp setHelp(String help) {
		this.help = help;
		return this;
	}

	@JsonProperty("usage")
	public String getUsage() {
		return usage;
	}

	public PluginHelp setUsage(String usage) {
		this.usage = usage;
		return this;
	}
}
