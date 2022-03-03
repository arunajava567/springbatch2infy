package com.infosys.dao;

import java.util.List;
import java.util.Optional;

import com.infosys.model.Order;

public interface OrderDAO {
	
	public void addOrder(Order o) throws Exception;
	public List<Optional<Order>> getAllOrders() throws Exception;
	public Optional<Order> getOrder(Integer id)throws Exception;
	public void deleteOrder(Integer id);
	public void updateOrder(Integer id);

}
