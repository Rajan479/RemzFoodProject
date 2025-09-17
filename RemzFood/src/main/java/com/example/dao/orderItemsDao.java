package com.example.dao;

import java.util.List;

import com.example.model.orderItems;

public interface orderItemsDao {
	void addOrderItems(orderItems o1);
	orderItems getOrderItems(int orderItemId);
	void updateOrderItems(orderItems o1);
	void delteOrderItems(int orderItemId);
	List<orderItems> getAllOrderItems();
}
