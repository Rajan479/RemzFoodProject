package com.example.model;

import java.util.Date;

// // in this model only we have to create pojo classes
public class user {
	private int userId;
	private String name;
	private String email;
	private int phoneno;
	private String Address;
	private String username;
	private String password;
	private String role;
	private Date createddate;
	private Date lastlogindate;
	
	public user() {
		
	}

	public user(int userId, String name, String email, int phoneno, String Address, String username, String password,
			String role, Date createddate, Date lastlogindate) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.Address = Address;
		this.username = username;
		this.password = password;
		this.role = role;
		this.createddate = createddate;
		this.lastlogindate = lastlogindate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getLastlogindate() {
		return lastlogindate;
	}

	public void setLastlogindate(Date lastlogindate) {
		this.lastlogindate = lastlogindate;
	}
	
	@Override
	public String toString() {
		return userId + " " + name + " " + email + " " + phoneno + " " + Address + " " + username + " " 
				+ password + " " + role + " " + createddate + " " + lastlogindate;
	}
}
