package org.powertrip.rebot.common.interfaces.api;

import org.powertrip.rebot.common.messages.wrappers.BotStats;
import org.powertrip.rebot.common.messages.Result;

import java.util.List;

/**
 * Created by Jaime on 03/01/2016.
 * 06:22
 */
public interface BotApiInterface {
	BotStats getUuid(BotStats stats);
	List<Long> getAllBotIds();
	List<Long> getLiveBotIds();
	List<Long> getFreeBotIds();
	List<BotStats> getBotStats(List<Long> botIds);
	Result clearOldBots(Long ageLimitInMillis);
}
