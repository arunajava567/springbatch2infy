package com.infosys.oops;

import java.util.Scanner;

class Customer{
	double duration;
	double amount;
	
	Customer() {
		duration=50;
		amount=3450000;
	}
	
	public Customer(double duration) {
		this.duration = duration;
	}

	Customer(double duration,double amount){
		this(duration);
		//this();
		//this.duration=duration;
		this.amount=amount;
	}
	
	public double getEmi(Customer cust) {
		return cust.amount/cust.duration;
	}
	
	
}

public class CallbyValueDemo {
	
	

	double getEmi(double amount) { //local
		return amount/12;
	}
	
	public static void main(String[] args) {
		CallbyValueDemo c=new CallbyValueDemo();
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		System.out.println(c.getEmi(amount));

		
		Customer cust=new Customer(15,250000);
		System.out.println(cust.getEmi(cust));
	}

}
