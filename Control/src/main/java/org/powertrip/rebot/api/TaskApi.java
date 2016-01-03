package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.TaskApiInterface;
import org.powertrip.rebot.common.messages.Reply;
import org.powertrip.rebot.common.messages.Task;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jaime on 03/01/2016.
 * 07:16
 */

@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskApi implements TaskApiInterface {

	@GET
	@Path("/{botId}")
	@Override
	public Task getTask(@PathParam("botId") Long botId) {
		return null;
	}

	@GET
	@Path("/{botId}/{jobId}/{taskId}/alive")
	@Override
	public Reply checkIfTaskIsAlive(@PathParam("botId") Long botId, @PathParam("jobId") Long jobId, @PathParam("taskId") Long taskId) {
		return null;
	}


	@POST
	@Path("/reply")
	@Override
	public Reply submitReply(Reply reply) {
		return null;
	}


	@POST
	@Path("/final")
	@Override
	public Reply finishTask(Reply reply) {
		return null;
	}


}
