package com.infy.bean;

import org.springframework.stereotype.Component;

//@Component
public class Product {
	Double price;
	Integer id;
	
	public Product(Double price, Integer id) {
		super();
		this.price = price;
		this.id = id;
	}

	public String getProduct() {
		return "Good prpoduct";
	}

}
