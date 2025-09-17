package com.example.dao;

import java.util.List;

import com.example.model.restaurant;

public interface restaurantdao {
	void addRestaurants(restaurant r1);
	restaurant getRestaurant(int restaurantId);
	void updateRestaurant(restaurant r1);
	void deleteRestaurant(int restaurantId);
	List<restaurant> getAllRestaurants(); 
}
