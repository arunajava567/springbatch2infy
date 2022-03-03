package com.infy;



class ProductNotFoundException extends Exception{
	ProductNotFoundException(String s){
		super(s);
	}
}
public class Product {
	Integer productId;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Product(Integer productId) {
		super();
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + "]";
	}
	

}
