import java.sql.*;
import java.util.Scanner;

public class MY_1ST_JDBC {
	public void my_jdbc() {
		try {
			System.out.println("Enter the class path");
			Scanner sc = new Scanner(System.in);
			String class_path = sc.nextLine();
			Class.forName(class_path);
			System.out.println("Enter the user and pass");
			System.out.println("user");
			String use = sc.next();
			System.out.println("pass");
			String pass = sc.next();
			Connection conn = DriverManager.getConnection("jdbc:mysql:\\localhost:3306/yogi",use,pass);
			Statement st = conn.createStatement();
			System.out.println("enter your sql commands");
			String sqlQueary = sc.nextLine();
			int i = st.executeUpdate(sqlQueary);
			sc.close();
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
		
		
		public static void main(String[]args){
//			MY_1ST_JDBC obj = new MY_1ST_JDBC();
//			obj.my_jdbc();
			try {
				System.out.println("Enter the class path");
				Scanner sc = new Scanner(System.in);
				String class_path = sc.nextLine();
				
				
				
				Class.forName(class_path);
				
				
				System.out.println("Enter the user and pass");
				System.out.println("user");
				String use = sc.next();
				System.out.println("pass");
				String pass = sc.next();
				System.out.println("enter your sql commands");
				String sql = sc.nextLine();
				
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi",use,pass);
				
				
				Statement st = conn.createStatement();
				int i = st.executeUpdate(sql);
				sc.close();
				conn.close();
			}
			catch(SQLException |ClassNotFoundException e){
				System.out.println(e);
			
			}
	}

}
