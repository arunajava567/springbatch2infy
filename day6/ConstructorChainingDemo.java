package com.infosys;

class Person{
	private Integer id;
	private String name;
	Person() {
		
	}
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

class Employee extends Person{
	private String designation;
	Employee() {
	super();	
	}
	public Employee(String designation) {
		//super(102,"ram");
		this();
		this.designation = designation;
	}
	
}


public class ConstructorChainingDemo {
	static int sum(String name,int ...a) {
		int s=0;
		System.out.println(name);
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}
	public static void main(String[] args) {
		int a[]= {2,3,4};
		int b[]= {5,6,7,8,9,2,3,4,5};
		int c[]= {2,1,3,4,2,3,53,2,4,45,6,7};
		System.out.println(sum("Ram",a));
		System.out.println(sum("Raj",b));
		System.out.println(sum("Kiran",c));
		
		

	}

}
