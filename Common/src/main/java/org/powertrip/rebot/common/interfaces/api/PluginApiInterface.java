package org.powertrip.rebot.common.interfaces.api;

import org.powertrip.rebot.common.messages.wrappers.PluginStats;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.PluginHelp;

import java.util.List;

/**
 * Created by Jaime on 03/01/2016.
 * 06:22
 */
public interface PluginApiInterface {
	Result install(String url);
	List<PluginStats> getPlugins();
	PluginHelp getPluginHelp(String name);
	Result removePlugin(String name);
}
