package com.infosys;



class Employee1 {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		
		Emp e1=new Emp(10,null,new Department(12,"chennai") );
		Emp e2=(Emp)e1.clone(); //protytyping
		System.out.println(e1 +"  "+e2);
		System.out.println(e1.hashCode() +"  "+e2.hashCode());

	}


	


	

}
