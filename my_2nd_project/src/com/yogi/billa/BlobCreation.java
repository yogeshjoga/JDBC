package com.yogi.billa;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class BlobCreation {
	public void blobMeth() throws Exception{
		String qury ="insert into blobsunny values(sno, name, image),(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","root");
		PreparedStatement prepStmt = con.prepareStatement(qury);
		prepStmt.setInt(1,001);
		prepStmt.setString(2, "lovelysunny");
		FileInputStream fiNp = new FileInputStream("C:\\Users\\yogen\\OneDrive\\Desktop\\sunny3.jpg");
		prepStmt.setBinaryStream(3, fiNp);
		int i = prepStmt.executeUpdate();
		while(i>0) {
			System.out.println("table created succesfully......");
			break;
		}
		
		
	}
	public static void main(String[] args)throws Exception {
		BlobCreation obj = new BlobCreation();
		obj.blobMeth();
	}

}
