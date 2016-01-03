package org.powertrip.rebot.common.messages;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaime on 03/01/2016.
 * 05:00
 */
public class Result implements Serializable {
	private Job job;
	private Boolean successfull;
	private Boolean complete;
	private Map<String, String> results;

	public Result() {
		results = new HashMap<>();
	}

	@JsonProperty("job")
	public Job getJob() {
		return job;
	}

	public Result setJob(Job job) {
		this.job = job;
		return this;
	}

	@JsonProperty("successfull")
	public Boolean getSuccessfull() {
		return successfull;
	}

	public Result setSuccessfull(Boolean successfull) {
		this.successfull = successfull;
		return this;
	}

	@JsonProperty("complete")
	public Boolean getComplete() {
		return complete;
	}

	public Result setComplete(Boolean complete) {
		this.complete = complete;
		return this;
	}

	@JsonProperty("results")
	public Map<String, String> getResults() {
		return results;
	}

	public Result setResults(Map<String, String> results) {
		this.results = results;
		return this;
	}

	@JsonIgnore
	public String getResult(String key){
		return results.get(key);
	}

	public Result setResult(String key, String value){
		results.put(key, value);
		return this;
	}
}
