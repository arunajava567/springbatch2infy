package com.infosys.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ProductListDemo {
	public static void main(String[] args) {
		ArrayList<Product>  productList=new ArrayList<Product>();
		//add
		productList.add(new Product(10,"laptop",90.00,99999.99,0.00));
		productList.add(new Product(11,"mobile",90.00,99999.99,0.00));
		productList.add(new Product(12,"tablet",90.00,99999.99,0.00));
		System.out.println(productList);
		//list
		Iterator<Product> it=productList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("after remove====");
		//delete
		Iterator<Product> it1=productList.iterator();
		while(it1.hasNext()) {
			Product p=it1.next();
			if(p.id==12)
				it1.remove();
		}
		Iterator it2=productList.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("after update====");
		//update
		Iterator it3=productList.iterator();
		while(it3.hasNext()) {
			Product p=(Product)it3.next();
			if(p.qty==12)
				p.unitPrice=5000.00;
				
				
			
		}
		Iterator it4=productList.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
					
		}
		
		
		
		
		
	}
}
