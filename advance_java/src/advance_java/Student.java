package advance_java;

import java.sql.*;
import java.util.Scanner;

public class Student {

	public static void main(String [] args) throws Exception {
		
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String pwd = "root";
		String connectionUrl = "jdbc:mysql://localhost:3306/yogi";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the records \n 1) Enter id \n 2) Enter Name \n 3) Enter num");
		String stdId = sc.nextLine();
		String stdName = sc.nextLine();
		String stdNum = sc.nextLine();
		
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection(connectionUrl,userName,pwd);
			
			
			String sql = "INSERT INTO studentsjava (studentId, studentName, studentNum)" + " VALUES (?, ?, ?)";
			// Statements 
			// PreparedStatement
			// CallableStatement
			
			
			/***
			 * crud
			 * 
			 * create database yogi (databaseName)
			 * create table table name (column)
			 *  ex: crate table yogi (sno integer, name varchar2(40));
			 *   insert into tableName ( 
			 *    
			 */
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, stdId);
			stmt.setString(2, stdName);
			stmt.setString(3, stdNum);
			
			int rs = stmt.executeUpdate();
			
			  if(rs > 0) {
				   System.out.println("A new user had been inserted successfully into the student database...");
		      	}
			con.close();
			
		}
		
		
		catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		finally {
			System.out.println("successfully completed...");
			
		}
	}
}
