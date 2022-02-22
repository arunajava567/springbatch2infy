package com.infy;

public class Product {
 
	Integer productId;
	String name;
	Double qty;
	Double price;
	Double discount;
	Double totalPrice;
	Double netPrice;
	
	public Product(Integer productId, String name) {
		
		this.productId = productId;
		this.name = name;
	}





	public Product(Integer productId, String name, Double qty, Double price) {
		
		this.productId = productId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}





	Product() { //initialization
		productId=101;
		name="Bag";
		 qty=40.78;
		price=60.45;
	}
	
public	void updateProduct(Product p) {//pass by ref
		this.name=p.name.toUpperCase();
		this.productId=p.productId+100;
	}
	
public	void caclTotalPrice(double unitPrice,double qty) {//pass by value
		totalPrice=unitPrice*qty;
		System.out.println("Total Price="+totalPrice);
	}
	
 public  double getDiscount(double totalPrice) {
	   double clearancesaleoffer=1000.00;
	   discount=(totalPrice*0.10)-clearancesaleoffer;
	   return discount;
   }

public	void dispProductDetails() {
		String name="xxx";//locla
		System.out.println(productId +"  "+name +"  "+ qty +" "+ price);
	}
	
public	double calcNetBill() {
		return totalPrice-discount;
	}
	
}
