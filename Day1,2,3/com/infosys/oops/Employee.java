package com.infosys.oops;


//child, derived ,sub               //parent, base, super


public class Employee extends Person{
	
	String companyName;
	Double salary;
	Employee() {
		this.companyName="Infosys";
		this.salary=897878.89;
	}
	
	void showEmpDetails() {
		System.out.println(companyName+"  "+salary);
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e.name+"  "+e.id+"  "+e.age);
		e.readPersonDetails();
		e.displayPersonDetails();
		System.out.println(e.companyName+"  "+e.salary);
		e.showEmpDetails();
		
	}

}
