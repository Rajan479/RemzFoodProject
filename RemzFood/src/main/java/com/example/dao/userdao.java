package com.example.dao;

import java.util.List;

import com.example.model.user;

// // in this dao we have to create dao implementation
public interface userdao{
	 void addUser(user u);
	 user getUser(int userId);
	 void updateUser(user u);
	 void deleteUser(int userId);
	 List<user> getAllUser();
}
