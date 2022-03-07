package com.infy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.infy.bean")
@PropertySource("classpath:messages.properties")
public class SpringConfig {
	
	
	
	
	
}