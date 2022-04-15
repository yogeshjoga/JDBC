package advance_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	
	  public static void main(String[] args) {
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","root");
			  Statement stmt = con.createStatement();
			  // don't use the pranthesis inside the code 
			  int i = stmt.executeUpdate("update studentsjava set studentId =101 where studentNum=9");
			  
			  
		  }
		  catch (Exception e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		  finally {
			  System.out.println("Done.. the table");
			
		}
		
	}

}
