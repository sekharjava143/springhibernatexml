package com.spring.bean;

import java.io.Serializable;

public class User implements Serializable{
	private int userId;
	private String name;
	private String city;
	
	public User() {
		
	}
	
	public User(String name, String city) {
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
