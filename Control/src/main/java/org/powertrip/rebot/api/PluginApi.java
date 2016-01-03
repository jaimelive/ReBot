package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.PluginApiInterface;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.PluginHelp;
import org.powertrip.rebot.common.messages.wrappers.PluginStats;

import javax.ws.rs.*;
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
	@POST
	@Path("/")
	@Override
	public Result install(String url) {
		return null;
	}

	@GET
	@Path("/list")
	@Override
	public List<PluginStats> getPlugins() {
		return null;
	}

	@GET
	@Path("/{name}/help")
	@Override
	public PluginHelp getPluginHelp(@PathParam("name") String name) {
		return null;
	}

	@DELETE
	@Path("/{name}")
	@Override
	public Result removePlugin(@PathParam("name") String name) {
		return null;
	}
}
