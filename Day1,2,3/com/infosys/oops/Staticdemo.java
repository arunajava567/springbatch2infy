package com.infosys.oops;

public class Staticdemo {

	public static void main(String[] args) {
		System.out.println("main started..");
	Company c1=new Company(1,"Tata","Mumbai");
	
	Company c2=new Company(2,"Reliance","Mumbai");
	Company c3=new Company(3,"Maruthi","Hyderabad");
	c1.disp();
	c1.show();
	c2.disp();
	c2.show();
	
	c3.disp();
	c3.show();
	Company.show();
	System.out.println(Company.country);
	

	}

}
