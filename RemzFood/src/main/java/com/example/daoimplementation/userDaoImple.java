package com.example.daoimplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.example.dao.userdao;
import com.example.model.user;

public class userDaoImple implements userdao{
	final static String INSERT_QUERY = "insert into `user` (`name`, `email`, `phoneno`, `Address` , `username`, `password`, `role`) "
			+ "values (?, ?, ?, ?, ?, ?, ?)";
	final static String SELECT_QUERY = "select * from `user` where `userId` = ?";
	private Connection con;
	
	public userDaoImple() {
		String url = "jdbc:mysql://localhost:3306/projectjdbc", username = "AddYourMysqlUsername", password = "AddYourMysqlPassword";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addUser(user u) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(INSERT_QUERY);
			
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getEmail());
			pstmt.setInt(3, u.getPhoneno());
			pstmt.setString(4, u.getAddress());
			pstmt.setString(5, u.getUsername());
			pstmt.setString(6, u.getPassword());
			pstmt.setString(1, u.getRole());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public user getUser(int userId) {
		PreparedStatement pstmt = null;
		user u = null;
		ResultSet res = null;
		
		try {
			pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, userId);
			
			res = pstmt.executeQuery();
			
			if(res.next()) {
				String name = res.getString("name");
				String email = res.getString("email");
				int phonenumber = res.getInt("phoneno");
				String address = res.getString("Address");
				String username = res.getString("username");
				String password = res.getString("password");
				String role = res.getString("role");
				Date createdate = res.getDate("createddate");
				Date lastlogindate = res.getDate("lastlogindate");
				
				u = new user(userId, name, email, phonenumber, address, username, password, role, createdate, lastlogindate);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateUser(user u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<user> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}

