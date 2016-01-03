package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.BotApiInterface;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.BotStats;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Jaime on 03/01/2016.
 * 07:30
 */

@Path("/bot")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BotApi implements BotApiInterface{
	@Override
	public BotStats getUuid(BotStats stats) {
		return null;
	}

	@Override
	public List<Long> getAllBotIds() {
		return null;
	}

	@Override
	public List<Long> getLiveBotIds() {
		return null;
	}

	@Override
	public List<Long> getFreeBotIds() {
		return null;
	}

	@Override
	public List<BotStats> getBotStats(List<Long> botIds) {
		return null;
	}

	@Override
	public Result clearOldBots(Long ageLimitInMillis) {
		return null;
	}
}
