package com.infosys.string;

import java.util.Date;

class Cab{
	
	Integer cabId;
	String model;
	double price;
	Cab() {}
	public Cab(Integer cabId, String model, double price) {
		super();
		this.cabId = cabId;
		this.model = model;
		this.price = price;
	}
	
	
}

public class Cabdemo {

	public static void main(String[] args) {
		// static in nature,  homogeneous //similar types
		int a[]=new int[5];  //primitives
		Cab cabs[]=new Cab[5]; //custom object 
		cabs[0]=new Cab(101,"Mini",500.00);
		cabs[1]=new Cab(102,"Mini123",500.00);
		cabs[2]=new Cab(103,"Sedan",750.00);
		cabs[3]=new Cab(104,"Mini123",500.00);
		cabs[4]=new Cab(105,"Mini5",500.00);
		
		System.out.println(" for loop");
		for(int i=0;i<cabs.length-1;i++)
			System.out.println(cabs[i].cabId +"  "+cabs[i].model+"  "+cabs[i].price);
		System.out.println(" for each loop");
		for(Cab c: cabs)
			System.out.println(c.cabId+"  "+c.model+"   "+c.price);

		Object o[]=new Object[5];
		o[0]=new Cab(105,"Mini5",500.00);
		o[1]=new Date();
		o[2]=new String("java");
		o[3]=new Double(3435.234);
		o[4]=new Integer(20);
		for(Object o1: o)
			System.out.println(o1);

		
	}

}
