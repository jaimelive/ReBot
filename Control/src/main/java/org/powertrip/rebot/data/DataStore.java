package org.powertrip.rebot.data;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Jaime on 03/01/2016.
 * 07:06
 */
public class DataStore {
	private static JedisPool pool = null;

	public static void init(String host, int port){
		DataStore.pool = new JedisPool(new JedisPoolConfig(), host, port);
	}

	public synchronized static Jedis getJedis(){
		if(pool==null) return null;
		return pool.getResource();
	}
}
