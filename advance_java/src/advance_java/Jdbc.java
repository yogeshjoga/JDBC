package advance_java;
import java.sql.*;
public class Jdbc {
	public static void main(String [] args) {
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/konda","root","root");  
		Statement stmt=con.createStatement(); 
		//int rs= stmt.executeUpdate("create database konda");
		int rs=stmt.executeUpdate("create table student(sno integer, name varchar(30))");
		System.out.println("table created: "+rs);
		con.close();  
		}
	catch(Exception e){
			System.out.println(e);
			}  
	}
}
