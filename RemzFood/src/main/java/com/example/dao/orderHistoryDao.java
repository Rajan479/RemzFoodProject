package com.example.dao;

import java.util.List;

import com.example.model.orderHistory;

public interface orderHistoryDao {
	void addOrderHistory(orderHistory o);
	orderHistory getOrderHistory(int idorderHistoryId);
	void updateOrderHistory(orderHistory o);
	void deleteOrderHistory(int idorderHistoryId);
	List<orderHistory> getAllOrderHistory();
}
