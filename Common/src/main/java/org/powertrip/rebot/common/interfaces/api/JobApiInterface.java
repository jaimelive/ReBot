package org.powertrip.rebot.common.interfaces.api;

import org.powertrip.rebot.common.messages.Job;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.JobCheck;

/**
 * Created by Jaime on 03/01/2016.
 * 06:23
 */
public interface JobApiInterface {
	Result run(Job job);
	JobCheck check(long jobId);
	Result getResult(long jobId);
	Result cancel(long jobId);
	Result clear(long jobId);
}
