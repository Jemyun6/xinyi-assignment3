package com.assignment3;

/*
 * a UserPOJO Class 
*/

public class UserPOJO {
	private String username;
	private String password;
	private String name;

	public UserPOJO() {} 

	public UserPOJO(String[] info) {
		super();
		this.username = info[0];
		this.password = info[1];
		this.name = info[2];
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserPOJO [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
	
 
}
