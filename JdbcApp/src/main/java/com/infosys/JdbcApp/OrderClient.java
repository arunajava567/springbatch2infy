package com.infosys.JdbcApp;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.infosys.dao.OrderDAO;
import com.infosys.dao.OrderDAOImpl;
import com.infosys.model.Order;

public class OrderClient {

	
	public static void main(String[] args)  throws Exception {
		OrderDAO od=new OrderDAOImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("entre order details");
		Integer id=sc.nextInt();
		String name=sc.next();
		Order o=new Order(id,name);
			od.addOrder(o);	
			
			System.out.println("entre order id to display");
			Integer id1=sc.nextInt();
			Optional<Integer> idd1=Optional.of(id1);
			//Order od1=od.getOrder(idd1.get());
			Order od1=od.getOrder((Integer)Optional.ofNullable(null).get());
			System.out.println(od1);
			System.out.println(" ===order list=====");
		    List<Order> olist=od.getAllOrders();
		    olist.stream().forEach(x->System.out.println(x));
		    
	}
}
