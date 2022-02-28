package com.infosys.collections;
import java.util.*;
class Employee {
	private Integer id;
	private String name;
	private double sal;
	public Employee(Integer id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		
	//	Set<Employee> eset=new TreeSet<Employee>(new SalaryComparator());
		List<Employee> eset=new ArrayList<Employee>();
		eset.add(new Employee(2,"Ram",89999.99));
		eset.add(new Employee(5,"Arun",69999.99));
		eset.add(new Employee(3,"John",99999.99));
		eset.add(new Employee(1,"Bindu",49999.99));
		Collections.sort(eset,new NameComparator());
		System.out.println(eset);
	}
}
