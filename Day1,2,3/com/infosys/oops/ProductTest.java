package com.infosys.oops;

import com.infy.Product;

public class ProductTest {

	public static void main(String[] args) {
		int x=20;//local
		Product p=new Product(101,"box",456.45,78.98);
		Product pp=p;
		p=null;
		
		//p.dispProductDetails();
		Product p1=new Product(102,"table",342.34,54.67);
		p1.dispProductDetails();
		System.out.println(p +"  "+ p1);
		Product p2=new Product(103,"laptop");
		
	//	p.updateProduct(p);
	//	p.caclTotalPrice(456.45,78.98); //to pass arguments
		
		//System.out.println("Discount:"+p.getDiscount(36050.421));
		
	//	double discount=p.getDiscount(36050.421);
		
		//System.out.println("Discount is :"+discount);
		
	//	System.out.println("Net Bill to be paid :"+p.calcNetBill());

	}

}
