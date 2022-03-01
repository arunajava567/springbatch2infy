package com.infosys.loggingandconfig;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertiesDemo {

	public static void main(String[] args) throws ConfigurationException{
		
		Configurations c1=new Configurations();
		PropertiesConfiguration c2=c1.properties("config.properties");
		System.out.println(c2.getProperty("db.url"));
		
		Iterator<String> keys=c2.getKeys();
		while(keys.hasNext()) {
			String k=keys.next();
			System.out.println(k+ "  "+c2.getProperty(k));
		}
		

	}

}
