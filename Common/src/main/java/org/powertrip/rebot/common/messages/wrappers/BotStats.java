package org.powertrip.rebot.common.messages.wrappers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Jaime on 03/01/2016.
 * 05:16
 */
public class BotStats implements Serializable {
	private Long id;
	private Long lastSeen;
	private Boolean busy;
	private String ipAddress;
	private String os;

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public BotStats setId(Long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("lastSeen")
	public Long getLastSeen() {
		return lastSeen;
	}

	public BotStats setLastSeen(Long lastSeen) {
		this.lastSeen = lastSeen;
		return this;
	}

	@JsonProperty("busy")
	public Boolean getBusy() {
		return busy;
	}

	public BotStats setBusy(Boolean busy) {
		this.busy = busy;
		return this;
	}

	@JsonProperty("ipAddress")
	public String getIpAddress() {
		return ipAddress;
	}

	public BotStats setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}

	@JsonProperty("os")
	public String getOs() {
		return os;
	}

	public BotStats setOs(String os) {
		this.os = os;
		return this;
	}
}
