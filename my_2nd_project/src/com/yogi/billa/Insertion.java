package com.yogi.billa;

import java.sql.*;
public class Insertion {
	public void inSer()throws Exception {
		String sql = "insert into yogesh values (id , name) ,(? ,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","root");
		PreparedStatement prepStmt = conn.prepareStatement(sql);
		prepStmt.setInt(1, 101);
		prepStmt.setString(2, "yogiJoga");
		int i = prepStmt.executeUpdate();
		while(i>0) {
			System.out.println("data is inserted.........");
			break;
		}
	}
	public static void main(String[] args)throws Exception {
		Insertion obj = new  Insertion();
		obj.inSer();
		
	}

}
