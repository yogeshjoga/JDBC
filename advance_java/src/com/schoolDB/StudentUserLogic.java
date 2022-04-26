package com.schoolDB;

import java.util.Scanner;

public class StudentUserLogic {
	Scanner scanner = new Scanner(System.in);
	StudentExams studentExams;
	
	public void studentDetailsInsertions() {
		System.out.println("Enter The Student Name....");
		String studentName = scanner.nextLine();
		System.out.println("Enter The Student RollNum...");
		int studentRollNum = scanner.nextInt();
		System.out.println("Enter the Student class...");
		int studentClass = scanner.nextInt();
		System.out.println("Enter the Student PhoneNumber...");
		int studentPhoneNum = scanner.nextInt();
		
		System.out.println("Enter the Student Address...");
		String studentAddr = scanner.next();
		
		System.out.println("Enter the Student Telugu Marks..");
		double telugu = scanner.nextDouble();
		System.out.println("Enter the Student English Marks...");
		double english = scanner.nextDouble();
		System.out.println("Enter the Student Hindi Marks...");
		double hindi = scanner.nextDouble();
		System.out.println("Enter the Student Maths Marks...");
		double maths = scanner.nextDouble();
		System.out.println("Enter the Student Science Marks...");
		double science = scanner.nextDouble();
		System.out.println("Enter the Student Social Marks...");
		double social = scanner.nextDouble();
	
		
		this.studentExams = new StudentExams(studentName, studentRollNum, studentClass, studentPhoneNum, studentAddr, telugu, english, hindi, maths, science, social);
		
		
	}
	
	public static void main(String[] args)throws Exception {
		System.out.println("WELCOME TO STUDENT CRM  CREATED BY JOGA YOGESH");
		System.out.println("For more info goto my github account  www.github.com/yogesh-joga/jdbc");
		
		
		StudentUserLogic studentUserLogic = new StudentUserLogic();
		StudentExams studentExams = new StudentExams();
		studentUserLogic.studentDetailsInsertions();
		StudentsInputs studentsInputs = new StudentsInputs();
		studentsInputs.updatation(studentExams);
		
	}

}
