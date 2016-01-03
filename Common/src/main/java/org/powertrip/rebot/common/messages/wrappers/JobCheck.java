package org.powertrip.rebot.common.messages.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.powertrip.rebot.common.messages.Job;

import java.io.Serializable;

/**
 * Created by Jaime on 03/01/2016.
 * 05:02
 */
public class JobCheck implements Serializable {
	private Job job;
	private JobStats jobStats;

	@JsonProperty("job")
	public Job getJob() {
		return job;
	}

	public JobCheck setJob(Job job) {
		this.job = job;
		return this;
	}

	@JsonProperty("jobStats")
	public JobStats getJobStats() {
		return jobStats;
	}

	public JobCheck setJobStats(JobStats jobStats) {
		this.jobStats = jobStats;
		return this;
	}
}
