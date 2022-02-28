package com.infosys.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Product {
	Integer id;
	String name;
	double qty;
	double unitPrice;
	double totalPrice;
	
	Product() {
		
	}

	public Product(Integer id, String name, double qty, double unitPrice, double totalPrice) {
		
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", unitPrice=" + unitPrice + ", totalPrice="
				+ totalPrice + "]";
	}
	
}

public class CollectionDemo {

	public static void main(String[] args)  throws IOException{
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Product[] products=new Product[10];
		
		Object o[]=new Object[10];
		//products[0].id=101;
	//	System.out.println(products[0].id);
		for(int i=0;i<2;i++) {
			 products[i]=new Product();
			products[i].id=Integer.parseInt(br.readLine());  
			products[i].name=br.readLine();
			products[i].qty=Double.parseDouble(br.readLine());
			products[i].unitPrice=Double.parseDouble(br.readLine());
		}
		
		System.out.println(" Products list");
		for(int i=0;i<2;i++) {
			System.out.println(products[i].id);
			System.out.println(products[i].name);
			
		}
		
	}

}
