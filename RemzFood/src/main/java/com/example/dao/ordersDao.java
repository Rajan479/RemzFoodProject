package com.example.dao;

import java.util.List;

import com.example.model.orders;

public interface ordersDao {
	void addOrder(orders o);
	orders getOrder(int orderId);
	void updateOrder(orders o);
	void deleteOrder(int orderId);
	List<orders> getAllOrders();
}
