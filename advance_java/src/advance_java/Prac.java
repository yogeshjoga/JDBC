package advance_java;

import java.sql.*;
import java.util.Scanner;


public class Prac {
	String url = "jdbc:mysql://localhost:3306/";
	String userName = "root";
	String pwd = "root";
	String dver = "com.mysql.cj.jdbc.Driver";
	
     public void prepStmt(String dbName,String tName,String uPdt, String were)throws Exception {
    	 String query = "update "+tName+" set "+uPdt+" where "+were;
    	 Class.forName(this.dver);
    	 Connection con = DriverManager.getConnection(this.url+dbName,this.userName,this.pwd);
    	 PreparedStatement prpstmt = con.prepareStatement(query);
    	 int i = prpstmt.executeUpdate();
    	 while(i>0) {
    		 System.out.println("Updated url is "+dbName+"/"+tName+"/.....");
    		 break;
    	 }
    	 con.close();
    	 
	}
     public static void main(String[] args)throws Exception {
    	 		Prac obj = new Prac();
    	 		System.out.println(" Enter the DataBase name \n Enter table Name \n update query \n where statement");
    	 		Scanner sc = new Scanner(System.in);
    	 		String dbName = sc.next();
    	 		String tName = sc.next();
    	 		String uPdt = sc.next();
    	 		String were = sc.next();
    	 		obj.prepStmt(dbName,tName,uPdt,were);
    	 		sc.close();
	}
}
