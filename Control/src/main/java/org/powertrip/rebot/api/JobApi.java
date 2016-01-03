package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.JobApiInterface;
import org.powertrip.rebot.common.messages.Job;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.JobCheck;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jaime on 03/01/2016.
 * 07:30
 */

@Path("/job")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JobApi implements JobApiInterface{
	@Override
	public Result run(Job job) {
		return null;
	}

	@Override
	public JobCheck check(long jobId) {
		return null;
	}

	@Override
	public Result getResult(long jobId) {
		return null;
	}

	@Override
	public Result cancel(long jobId) {
		return null;
	}

	@Override
	public Result clear(long jobId) {
		return null;
	}
}
