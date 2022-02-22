package com.infosys.oops;

public class Scholar {
	private Integer id;
	private String name;
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
	
	void show() {
		Person p=new Person();
		System.out.println(p.age);
		
	}
	
	

}
