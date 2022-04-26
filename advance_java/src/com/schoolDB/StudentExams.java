package com.schoolDB;

public class StudentExams {
	private String studentName;
	private int studentRollNum;
	private int studentClass;
	private int studentPhoneNum;
	private String studentAddr;
	private double telugu;
	private double english;
	private double hindi;
	private double maths;
	private double science;
	private double social;
	private double totalMarks;
	private double percentage;
	private String grade;
	
	

	public StudentExams() {
		super();
	}

	public StudentExams(String studentName, int studentRollNum, int studentClass, int studentPhoneNum,
			String studentAddr, double telugu, double english, double hindi, double maths, double science,
			double social/* , double totalMarks, double percentage, String grade */) {
		super();
		this.studentName = studentName;
		this.studentRollNum = studentRollNum;
		this.studentClass = studentClass;
		this.studentPhoneNum = studentPhoneNum;
		this.studentAddr = studentAddr;
		this.telugu = telugu;
		this.english = english;
		this.hindi = hindi;
		this.maths = maths;
		this.science = science;
		this.social = social;
		/*
		 * this.totalMarks = totalMarks; this.percentage = percentage; this.grade =
		 * grade;
		 */
		
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getStudentRollNum() {
		return studentRollNum;
	}



	public void setStudentRollNum(int studentRollNum) {
		this.studentRollNum = studentRollNum;
	}



	public int getStudentClass() {
		return studentClass;
	}



	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}



	public int getStudentPhoneNum() {
		return studentPhoneNum;
	}



	public void setStudentPhoneNum(int studentPhoneNum) {
		this.studentPhoneNum = studentPhoneNum;
	}



	public String getStudentAddr() {
		return studentAddr;
	}



	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}



	public double getTelugu() {
		return telugu;
	}



	public void setTelugu(double telugu) {
		this.telugu = telugu;
	}



	public double getEnglish() {
		return english;
	}



	public void setEnglish(double english) {
		this.english = english;
	}



	public double getHindi() {
		return hindi;
	}



	public void setHindi(double hindi) {
		this.hindi = hindi;
	}



	public double getMaths() {
		return maths;
	}



	public void setMaths(double maths) {
		this.maths = maths;
	}



	public double getScience() {
		return science;
	}



	public void setScience(double science) {
		this.science = science;
	}



	public double getSocial() {
		return social;
	}



	public void setSocial(double social) {
		this.social = social;
	}
	

	
	public double getTotalMarks() {
		return totalMarks;
	}



	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}



	public double getPercentage() {
		return percentage;
	}



	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
	

}
