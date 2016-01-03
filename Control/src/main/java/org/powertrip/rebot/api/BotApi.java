package org.powertrip.rebot.api;

import org.powertrip.rebot.common.interfaces.api.BotApiInterface;
import org.powertrip.rebot.common.messages.Result;
import org.powertrip.rebot.common.messages.wrappers.BotStats;

import javax.ws.rs.*;
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

	@POST
	@Path("/uuid")
	@Override
	public BotStats getUuid(BotStats stats) {

		return null;
	}

	@GET
	@Path("/all")
	@Override
	public List<Long> getAllBotIds() {
		return null;
	}

	@GET
	@Path("/live")
	@Override
	public List<Long> getLiveBotIds() {
		return null;
	}

	@GET
	@Path("/free")
	@Override
	public List<Long> getFreeBotIds() {
		return null;
	}

	@POST
	@Path("/stats")
	@Override
	public List<BotStats> getBotStats(List<Long> botIds) {
		return null;
	}

	@DELETE
	@Path("/{ageLimitMillis}")
	@Override
	public Result clearOldBots(@PathParam("ageLimitMillis") Long ageLimitInMillis) {
		return null;
	}
}
