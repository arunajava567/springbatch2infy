package com.infosys.oops;


public class Demo {

	public static void main(String[] args) {
		//real world entity , members , function
		Person p=new Person();//instantiation, oject cretaion , memory
		p.id=1;
		p.name="ram";
		p.age=20;
		System.out.println(p.id+"  "+p.name+"  "+p.age);
		p.readPersonDetails();
		p.displayPersonDetails();
		Person p1=new Person();//instantiation, oject cretaion , memory
		p1.id=2;
		p1.name="ram kumar";
		p1.age=22;
		System.out.println(p1.id+"  "+p1.name+"  "+p1.age);
		p1.readPersonDetails();
		p1.displayPersonDetails();
		System.out.println(p +"  "+p1);
	
		Course c=new Course(101,"Java",879.88,9);
		Course c1=new Course(102,"J2ee");
		
	}

}
