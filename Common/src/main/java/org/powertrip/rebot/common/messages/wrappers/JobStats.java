package org.powertrip.rebot.common.messages.wrappers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Jaime on 03/01/2016.
 * 05:01
 */
public class JobStats implements Serializable {
	private Long jobUuid;
	private List<Long> bots;
	private Long botCount;
	private Long replyCount;
	private Long claimCount;
	private Map<String, String> stats;

	public JobStats() {
		bots = new LinkedList<>();
		stats = new HashMap<>();
	}

	@JsonProperty("jobUuid")
	public Long getJobUuid() {
		return jobUuid;
	}

	public JobStats setJobUuid(Long jobUuid) {
		this.jobUuid = jobUuid;
		return this;
	}

	@JsonProperty("bots")
	public List<Long> getBots() {
		return bots;
	}

	public JobStats setBots(List<Long> bots) {
		this.bots = bots;
		return this;
	}

	@JsonProperty("botCount")
	public Long getBotCount() {
		return botCount;
	}

	public JobStats setBotCount(Long botCount) {
		this.botCount = botCount;
		return this;
	}

	@JsonProperty("replyCount")
	public Long getReplyCount() {
		return replyCount;
	}

	public JobStats setReplyCount(Long replyCount) {
		this.replyCount = replyCount;
		return this;
	}

	@JsonProperty("claimCount")
	public Long getClaimCount() {
		return claimCount;
	}

	public JobStats setClaimCount(Long claimCount) {
		this.claimCount = claimCount;
		return this;
	}

	@JsonProperty("stats")
	public Map<String, String> getStats() {
		return stats;
	}

	public JobStats setStats(Map<String, String> stats) {
		this.stats = stats;
		return this;
	}

	@JsonIgnore
	public String getStat(String key){
		return stats.get(key);
	}

	public JobStats setStat(String key, String value){
		stats.put(key, value);
		return this;
	}
}
