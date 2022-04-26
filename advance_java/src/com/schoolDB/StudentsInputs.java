package com.schoolDB;

public class StudentsInputs {
	public static double totalMarks;
	public double percentage;
	
	public double studentResults(StudentExams studentExams) {
		StudentsInputs.totalMarks = studentExams.getEnglish() + studentExams.getTelugu() + studentExams.getHindi() + studentExams.getMaths() + studentExams.getScience() + studentExams.getSocial();	
		this.percentage = (StudentsInputs.totalMarks/600.00)*100.00;
		return this.percentage;
		}
	public String studentMarkGrade(StudentExams studentExams) {
		double studentResult = studentResults(studentExams);
		if(studentResult > 75) {
			return "A+";
		}
		else if(studentResult >= 65 || studentResult <= 75) {
			return "A";
		}
		else if(studentResult >= 50 || studentResult <= 65) {
			return "B";
		}
		else if(studentResult >= 40 || studentResult <= 50) {
			return "C";
		}
		else {
		return "fail";
		}
		
	}
	
	public void updatation() {
		StudentExams studentExams = new StudentExams();
		studentExams.setTotalMarks(StudentsInputs.totalMarks);
		studentExams.setPercentage(this.percentage);
		studentExams.setGrade(null);
		
	}

}
