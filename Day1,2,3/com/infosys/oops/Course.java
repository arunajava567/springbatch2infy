package com.infosys.oops;

public class Course {
	Integer courseId;
	String courseName;
	double fee;
	Integer duration;
	Course()
	{  courseId=101;
       courseName="Java";
	   fee=999.99;
	   duration=3;
	
		
	} //instance             //local 
	public Course(Integer courseId, String courseName, double fee, Integer duration) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
	}
	public Course(Integer courseId, String courseName) {
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		
	};
	

}
