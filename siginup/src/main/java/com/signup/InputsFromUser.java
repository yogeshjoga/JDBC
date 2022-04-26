package com.signup;

public class InputsFromUser {
	private String userName, phonenumber,email,password;
	
	public InputsFromUser() {
		super();
	}


	public InputsFromUser(String userName, String phonenumber, String email, String password) {
		super();
		this.userName = userName;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}
	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	

	
}
