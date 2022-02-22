package com.infosys.oops;
public class Company{
	Integer id;
	String name;
	String city;
	static String country="India";
	
	static {
		System.out.println(" sttaic block");
	}
	
	{
		System.out.println(" instance  block");
	}
	Company() {
		System.out.println("in constructor");
		
	}
	public Company(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	void disp() {
		int c=90;
		System.out.println(id+"  "+name+"  "+city);
	}
	static void show() {
		System.out.println(" Add ress: is India");
	}
	// sonar Lint, PMD
	
	public static void main(String[] args) {
		System.out.println("main started...");
		Company c1=new Company();
		
		Company c2=new Company();
		Company c3=new Company();
		
	}
}

