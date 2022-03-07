package com.infy.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:messages.properties")
@ComponentScan(basePackages="com.infy.service com.infy.repository com.infy.controller")
public class SpringConfig {
	
	
}
