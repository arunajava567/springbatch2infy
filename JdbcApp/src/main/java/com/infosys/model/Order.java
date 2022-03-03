package com.infosys.model;

public class Order {
	Integer id;
	String name;
public 	Order() {}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
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
	public Order(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
