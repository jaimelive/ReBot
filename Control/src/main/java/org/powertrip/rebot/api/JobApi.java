package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.JobApiInterface;
import org.powertrip.rebot.common.messages.Job;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.JobCheck;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jaime on 03/01/2016.
 * 07:30
 */

@Path("/job")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JobApi implements JobApiInterface{
	@POST
	@Path("/")
	@Override
	public Result run(Job job) {
		return null;
	}

	@GET
	@Path("/{jobId}/check")
	@Override
	public JobCheck check(@PathParam("jobId") long jobId) {
		return null;
	}

	@GET
	@Path("/{jobId}")
	@Override
	public Result getResult(@PathParam("jobId") long jobId) {
		return null;
	}

	@DELETE
	@Path("/{jobId}/cancel")
	@Override
	public Result cancel(@PathParam("jobId") long jobId) {
		return null;
	}

	@DELETE
	@Path("/{jobId}/clear")
	@Override
	public Result clear(@PathParam("jobId") long jobId) {
		return null;
	}
}
