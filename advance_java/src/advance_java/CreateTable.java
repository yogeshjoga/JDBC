package advance_java;

import java.sql.*;

public class CreateTable {
		public static void main(String[] args) {
			//String  url = "com.mysql.cj.jdbc.Driver", usrName = "root", pwd
			Bus obj = new Bus();
			try {
				Class.forName(obj.url);
				Connection con = DriverManager.getConnection(obj.conn,obj.userName,obj.pwd);
				Statement stmt = con.createStatement();
				int rst = stmt.executeUpdate(obj.creQu);
				con.close();
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				System.out.println("done.....");
			}
		}
}
