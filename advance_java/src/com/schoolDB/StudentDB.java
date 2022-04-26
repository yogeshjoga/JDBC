package com.schoolDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class StudentDB {
	private static String drvr = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/yogi";
	private String userName = "root";
	private String pwd = "root";
	private String sqlInsert = "insert into studentTable values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	//private String sqlUpdate = "update table studentTable where id=";
	
	static{

	try {
		Class.forName(drvr);
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
  }
	
	public Connection getConnection()throws Exception {
		 return DriverManager.getConnection(url,userName,pwd);
			
	}
	public StudentExams dbUpdateData(StudentExams studentExams)throws Exception {
				Connection connection =	getConnection();
				PreparedStatement prepStmt = connection.prepareStatement(sqlInsert);
	
		prepStmt.setString(1, studentExams.getStudentName());
		prepStmt.setInt(2,studentExams.getStudentRollNum());
		prepStmt.setInt(3, studentExams.getStudentClass());
		prepStmt.setInt(4, studentExams.getStudentPhoneNum());
		prepStmt.setString(5, studentExams.getStudentAddr());
		prepStmt.setDouble(6, studentExams.getTelugu());
		prepStmt.setDouble(7, studentExams.getEnglish());
		prepStmt.setDouble(8, studentExams.getHindi());
		prepStmt.setDouble(9, studentExams.getMaths());
		prepStmt.setDouble(10, studentExams.getScience());
		prepStmt.setDouble(11, studentExams.getSocial());
		prepStmt.setDouble(12, studentExams.getTotalMarks());
		prepStmt.setDouble(13, studentExams.getPercentage());
		prepStmt.setString(14, studentExams.getGrade());
		
		
		
		int insertSql = prepStmt.executeUpdate();
		if(insertSql>0) {
			System.out.println("Student date Updated successfully..");
		}
		return studentExams;
	}
	
	
	
}
