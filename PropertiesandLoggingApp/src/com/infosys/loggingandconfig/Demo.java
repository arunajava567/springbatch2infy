package com.infosys.loggingandconfig;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class Demo {

	public static void main(String[] args) throws Exception {
		Configurations configurations = new Configurations();
		PropertiesConfiguration config = configurations.properties("configuration.properties");
		Iterator<String> keys = config.getKeys();
		System.out.println("Value for server.port=" + config.getProperty("server.port"));
		
	}

}
