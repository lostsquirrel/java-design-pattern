package cn.com.lisong.designpattern.mvc;

public class StudentView {

	public void printStudentDetails(String studentRollNo, String studentName) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
