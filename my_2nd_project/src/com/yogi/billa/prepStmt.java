package com.yogi.billa;

import java.sql.*;
import java.util.Scanner;


public class prepStmt {
	
	String userName = "root";
	String pwd = "root";
	String drvr ="com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/yogi";
	
	
	/**
	 * this is the create Database creation by using this method
	 * so we need to execute this method
	 */
	public void cretDB(String dbName) throws Exception {
		    String dbCreate = "create database "+dbName;
			Class.forName(this.drvr);
			Connection con = DriverManager.getConnection(this.url,this.userName,this.pwd);
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(dbCreate);
			while (i>0) {
				System.out.println("Database created succsfully......");
				break;
			}
			con.close();
	}
	
	/**
	 * this is the create table inside the database 
	 * you type your database name and create the new fresh table
	 * 
	 * so need to use statement
	 */
	public void cretTable(String tName)throws Exception {
		String sqlCreate = "create table "+tName+"(userId integer,userName varchar(50),phoneNum integer)";
		Class.forName(this.drvr);
		Connection conn = DriverManager.getConnection(this.url,this.userName,this.pwd);
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(sqlCreate);
		while(i>0) {
			System.out.println("Table is created succsfully........");
			break;
		}
		conn.close();
	}
	
	
	
	/*
	 * this is used to retrieve the data from your required table
	 * can choose your database name as well as your table also
	 * 
	 */
	public void retriveTab(String tName) throws Exception{
		String qury = "select * from "+tName;
		Class.forName(this.drvr);
		Connection conn = DriverManager.getConnection(this.url,this.userName,this.pwd);
		Statement stmt = conn.createStatement();
		System.out.println("Enter query to select all from * table name of your table...");
		ResultSet rs = stmt.executeQuery(qury);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+ rs.getInt(3));
		}
		conn.close();
		
	}
	
	
	/*
	 * this is used to update table column
	 * 
	 */
	public void updtTable(String tName, String setValues,String wereCondition)throws Exception {
		String qury = "update "+tName+" set "+setValues+" where "+wereCondition;
		Class.forName(this.drvr);
		Connection con = DriverManager.getConnection(this.url,this.userName,this.pwd);
		//PreparedStatement stmt = con.prepareStatement(qury);
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(qury);
		while(i>0) {
			System.out.println("Updated table "+tName+"values"+wereCondition);
			break;
		}
		con.close();
		
		
		
	}
	
	
	public void stmtPrep(String tName,int id,String name) throws Exception{
		String qury = "insert into "+tName+"(id, name)"+"values(?,?)";
		Class.forName(this.drvr);
		Connection con = DriverManager.getConnection(this.url,this.userName,this.pwd);
		PreparedStatement prStmt = con.prepareStatement(qury);
		prStmt.setInt(1,id);
		prStmt.setString(2,name);
		int i = prStmt.executeUpdate();
		while(i>0) {
			System.out.println("update the talbe one column........");
			break;
		}
		con.close();
		
		
	}
	
	
	
	
	
	
	
	
	/**
	 * this is the delete table and delete the table cols,
	 */
	public void delTable(String tName) throws Exception{
		String query = "drop table "+tName;
		Class.forName(this.drvr);
		Connection con = DriverManager.getConnection(this.url,this.userName,this.pwd);
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		while(i>0) {
			System.out.println("Table deleted sucessfully....done");
			break;
		}
		
	}
	
	
	
	public static void main(String[] args)throws Exception {
		prepStmt obj = new prepStmt();
		Scanner sc = new Scanner(System.in);
		System.out.println("====Select the req function======");
		System.out.println(" 1) Create DataBase \n 2) Create Table \n 3) Retrive Table \n 4) Update Table \n 5) Delete Table \n 6) table values update");
		int opt = sc.nextInt();
		switch (opt) {
		// this is the  create database
		case 1: {
			System.out.println("Enter the new Database name....");
			String dbName = sc.next();
			obj.cretDB(dbName);
		}
		break;
		// this is the create table
		case 2: {
			System.out.println("Enter new table name....");
			String tname = sc.next();
			obj.cretTable(tname);
		}
		break;
		// returns the table data through the console ??????????????????????????????????????????????????????
		case 3: {
			System.out.println("Enter your Table name.....");
			String tName = sc.next();
			obj.retriveTab(tName);
		}
		break;
		// update the table 
		case 4:{
			System.out.println("Enter the values \n ex: update table yogi set name='yogi' where userNum = 001");
			System.out.println(" 1)tablename \n 2) values \n 3) where condition to update");
			String tName = sc.next();
			String setValues = sc.next();
			System.out.println("enter the where condition.........");
			String wereCondition = sc.next();
			obj.updtTable(tName,setValues,wereCondition);
			System.out.println("done");
		}
		break;
		// Delete the table 
		case 5:{
			System.out.println("Enter the table name for deletion");
			String tName = sc.next();
			obj.delTable(tName);
		}
		break;
		
		case 6: {
			System.out.println("Enter the insert values in the table");
			System.out.println(" 1) Enter the table name  \n 2) Enter the id of the emp \n 3) name of the empolyee");
			String tName = sc.next();
			int id = sc.nextInt();
			String name = sc.next();
			obj.stmtPrep(tName,id,name);
		}
			
			
		}
		
		
	}

}
