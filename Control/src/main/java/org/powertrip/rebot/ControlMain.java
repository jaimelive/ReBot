package org.powertrip.rebot;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.powertrip.rebot.api.BotApi;
import org.powertrip.rebot.api.JobApi;
import org.powertrip.rebot.api.PluginApi;
import org.powertrip.rebot.api.TaskApi;
import org.powertrip.rebot.controllers.ApiController;
import org.powertrip.rebot.data.DataStore;

/**
 * Created by Jaime on 03/01/2016.
 * 04:35
 */
public class ControlMain extends Application<ControlConfiguration> {
	private static ControlConfiguration configuration;
	private static ApiController apiController;

	public static void main(String args[]) throws Exception {
		apiController = new ApiController(
				BotApi.class,
				JobApi.class,
				PluginApi.class,
				TaskApi.class
		);
		new ControlMain().run(args);
	}

	@Override
	public void run(ControlConfiguration configuration, Environment environment) throws Exception {
		init(configuration, environment);


	}

	private void init(ControlConfiguration configuration, Environment environment){
		ControlMain.configuration = configuration;
		DataStore.init(configuration.getRedisHost(), configuration.getRedisPort());
		apiController.registerApis(environment.jersey());
	}

	private static ControlConfiguration getConfiguration(){
		return configuration;
	}

	@Override
	public String getName() {
		return "ReBotControl";
	}
}
