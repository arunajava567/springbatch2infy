package com.infosys.oops;

class Product{
	//data members, member variables, state
	private Integer productId;
	private String productName;
	private Double qty;
	private Double unitPrice;
	private Double totalPrice;
	private Double discount;
	
	Product() {
		productId=101;
		 productName="Bag";
		qty=20.0;
		 unitPrice=200.00;
		 totalPrice=0.0;
		 discount=0.0;
	}
	
	
	
	
	  public Product(Integer productId, String productName) {
		
		this.productId = productId;
		this.productName = productName;
	}




	public Product(Integer productId, String productName, Double qty, Double unitPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}




	public Integer getProductId() {
		return productId;
	}




	public void setProductId(Integer productId) {
		this.productId = productId;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public Double getQty() {
		return qty;
	}




	public void setQty(Double qty) {
		this.qty = qty;
	}




	public Double getUnitPrice() {
		return unitPrice;
	}




	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}




	public Double getTotalPrice() {
		return totalPrice;
	}




	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}




	public Double getDiscount() {
		return discount;
	}




	public void setDiscount(Double discount) {
		this.discount = discount;
	}




	public Product(Integer productId, String productName, Double qty, Double unitPrice, Double totalPrice,
			Double discount) {
	
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.discount = discount;
	}
	//methods, member functions, functions
	void readProductDetails() {
		
	}
	void displayProductDetails() {
		System.out.println(productId+"  "+productName);
		
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Product p=new Product();
		//p.productId=203;
		p.setProductId(101);
		p.setProductName("Table123");
		p.setQty(89.23);
		System.out.println(p.getProductId()+"  "+p.getProductName());
		
p.displayProductDetails();
		Product p1=new Product(101,"Box");
		Product p2=new Product(102,"Box",45.67,897.99);
	}

}
