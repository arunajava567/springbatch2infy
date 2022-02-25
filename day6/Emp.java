package com.infosys;


class Emp  implements Cloneable{
	
	Integer id;
	String name;
	Department department;

	public Emp(Integer id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}









	Emp() {
		
	}
	
	

	


	
	
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		
		Emp e1=new Emp(10,"Ram" ,new Department(10,"IT-Chennai"));
		
		Emp e2=(Emp)e1.clone(); //protytyping
		System.out.println(e1 +"  "+e2);
		System.out.println(e1.hashCode() +"  "+e2.hashCode());

	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", department=" + department + "]";
	}


protected Object clone() throws  CloneNotSupportedException
{
	 return super.clone();
	
}






	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
