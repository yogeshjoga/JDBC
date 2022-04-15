
import java.sql.*;

public class ThreeJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","root");
			Statement stmt = conn.createStatement();
			int sqlQu = stmt.executeUpdate("create table yogeshBilla (sno integer, name varchar(40))");
			conn.close();
			
		}
		
		catch(Exception e) {
		     System.out.println(e);
			
		}
		
		finally {
			System.out.println("database.....succ");
		}
	}
}
