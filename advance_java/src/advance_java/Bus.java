package advance_java;
import java.sql.*;



 /// crud 
 // create retrive update delete


public class Bus {
	String url = "com.mysql.jdbc.Driver";
	String conn = "jdbc:mysql://localhost:3306/yogi";
	String userName = "root";
	String pwd = "root";
	
	String creQu = "create table tiger22 (id integer, name varchar(50))";
	String cre1Qu = "select * from studentsjava";

		public static void main(String[] args) {
			
			Bus obj = new Bus();
			
			
			
			
			
			try {
				Class.forName(obj.url);
				Connection con = DriverManager.getConnection(obj.conn,obj.userName,obj.pwd);
				Statement stmt = con.createStatement();
				ResultSet rst = stmt.executeQuery(obj.cre1Qu);
				while (rst.next()) {
					System.out.println(rst.getInt(1)+" "+rst.getString(2)+" "+rst.getInt(3));
				}
				con.close();
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			finally {
				System.out.println("\n total database.......");
			}
		}
}
