package com.infy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	String name;
	Integer id;
	Student () {
		name="ram";
		id=101;
	}
	@Autowired
	Course course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void disp() {
		System.out.println(id+"  "+name);
		System.out.println(course.getCourse());
	}
	
}
