package com.infosys;
class Department {
	Integer id;
	String location;
	Department() {
		
	}
	public Department(Integer id, String location) {
		super();
		this.id = id;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", location=" + location + "]";
	}
	
}