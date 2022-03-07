package com.infy.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") //
public class Course  {
	
	
	public String getCourse() {
	return  "Java Course";
	}
	@PostConstruct
	public void start33333() {  //life cycle 
		System.out.println(" bean created...");
	}
	@PreDestroy
	public void end22222() {
		System.out.println(" bean destroyed..");
	}
}
