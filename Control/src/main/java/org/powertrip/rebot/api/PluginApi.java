package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.PluginApiInterface;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.PluginHelp;
import org.powertrip.rebot.common.messages.wrappers.PluginStats;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Jaime on 03/01/2016.
 * 07:30
 */

@Path("/plugin")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PluginApi implements PluginApiInterface{
	@Override
	public Result install(String url) {
		return null;
	}

	@Override
	public List<PluginStats> getPlugins() {
		return null;
	}

	@Override
	public PluginHelp getPluginHelp(String name) {
		return null;
	}

	@Override
	public Result removePlugin(String name) {
		return null;
	}
}
