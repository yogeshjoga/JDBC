package com.signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class LoginRegestation {
	
	private String url ="jdbc:mysql://localhost:3306/yogi";
	private String drvr = "com.mysql.cj.jdbc.Driver";
	private String user = "root";
	private String pwd = "root";
	
	public Connection getConnection() {
		Connection con = null; //DriverManager.getConnection(url,user,pwd);
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public String insert(InputsFromUser inputsFromUser) throws ClassNotFoundException {
		 String result = "Data entered Successfully";
		try {
			
			 Class.forName(drvr);
			 Connection con = getConnection();
			 String sql = "insert into users values(?,?,?,?)";
			 PreparedStatement prpt = con.prepareStatement(sql);
			 prpt.setString(1, inputsFromUser.getUserName());
			 prpt.setString(2, inputsFromUser.getPassword());
			 prpt.setString(3, inputsFromUser.getPhonenumber());
			 prpt.setString(4, inputsFromUser.getEmail());
			 
			
		} catch (SQLException e) {
			result= "data not entered";
			e.printStackTrace();
			
			
		}
		 
		return result;
	}

}
