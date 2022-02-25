package com.infosys.funcitonalinterface;

@FunctionalInterface
public  interface Loan {
	
	double getEmi(double amount);   //public, protected,default,private
	//int add(int a,int b);
	default void show() {
		System.out.println("default method");
		
	}
	static void staticshow() {
		System.out.println("intreface static method...");
	}
}