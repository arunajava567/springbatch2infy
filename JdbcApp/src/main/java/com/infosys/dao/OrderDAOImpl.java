package com.infosys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.infosys.model.Order;
import com.infosys.util.DbCon;

public class OrderDAOImpl  implements OrderDAO{
	public void addOrder(Order o)  throws Exception{
		
		Connection con=DbCon.getConn();
		PreparedStatement pst=con.prepareStatement("insert into order123 values(?,?)");
		pst.setInt(1, o.getId());
		pst.setString(2, o.getName());
		boolean result=pst.execute();//insert,update,delete,select
		System.out.println("insert success"+result);
		
		
	}

	
	  public List<Optional<Order>> getAllOrders() throws Exception{
		  Connection con=DbCon.getConn();
			PreparedStatement pst=con.prepareStatement("select * from order123");
			List<Optional<Order>> olist=new ArrayList<Optional<Order>>();
			ResultSet result=pst.executeQuery();//insert,update,delete,select
			while(result.next()) {
				Integer id1=result.getInt(1);
				String name1=result.getString(2);
				Optional<Order> o=Optional.of(Optional<Order>);
				o.setId(id1);;
				o.setName(name1);
				olist.add(o);
			}
		
		   return olist;	
	  
	
	  }
	public Optional<Order> getOrder(Integer id) throws Exception  {
		
		Connection con=DbCon.getConn();
		PreparedStatement pst=con.prepareStatement("select * from order123 where id=?");
		pst.setInt(1, id);
		Order o=new Order();
		ResultSet result=pst.executeQuery();//insert,update,delete,select
		while(result.next()) {
			Integer id1=result.getInt(1);
			String name1=result.getString(2);
			o.setId(id1);;
			o.setName(name1);
		}
	
	   return o;	
	}
	public void deleteOrder(Integer id) {
		
	}
	public void updateOrder(Integer id) {
		
	}

}
