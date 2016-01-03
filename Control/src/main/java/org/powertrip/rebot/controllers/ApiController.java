package org.powertrip.rebot.controllers;

import io.dropwizard.jersey.setup.JerseyEnvironment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jaime on 03/01/2016.
 * 07:37
 */
public class ApiController {
	private List<Object> apis;

	public ApiController(Class ...classes) {
		apis = new LinkedList<>();
		Arrays.asList(classes).forEach(
			clazz -> {
				try {
					apis.add(clazz.newInstance());
				} catch (InstantiationException | IllegalAccessException e) {e.printStackTrace();}
			}
		);
	}

	public void registerApis(JerseyEnvironment environment){
		apis.forEach(environment::register);
	}
}
