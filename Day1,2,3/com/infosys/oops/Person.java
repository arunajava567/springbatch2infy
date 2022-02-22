package com.infosys.oops;
//code reuse, security, simplicity
//encapsulation = binding data+ funcitons

public class Person{  //state , data member, membr vraiable
public	Integer id;
public 	String name;
	//private 
//protected 
private Integer age;//default //package 
	//JVM
	 void readPersonDetails() {
		 System.out.println("reading ");
	 }
	
	//private
	void displayPersonDetails() {
		 System.out.println("displaying"+ id +" "+name+"  " +age);
	 }

}
