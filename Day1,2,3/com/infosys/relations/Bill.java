package com.infosys.relations;

public class Bill {  //association uses a relation
  String name;
  Bill() {
	  name="Ram";
  }
  
	public void generateBill(Order order) { //call by ref
		
		order.setTotalPrice(order.getQty()*order.getUnitPrice());
		System.out.println(order.getTotalPrice());
	}
	
	public static void main(String[] args) {
		Bill bill=new Bill();
		Order order=new Order();
		order.setOrderId(101);
		order.setQty(50);
		order.setUnitPrice(400);
		bill.generateBill(order);
		
		

	}

}
