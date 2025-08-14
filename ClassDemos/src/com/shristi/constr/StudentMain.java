package com.shristi.constr;

public class StudentMain {

	public static void main(String[] args) {
		Student student =  new Student("Sri");
		student.getDetails();
		System.out.println();
		Student student1 =  new Student("Priya",10);
		student1.getDetails();
		System.out.println();
		
		Student student2 =  new Student("Joy","ECE");
		student2.getDetails();
		System.out.println();
		
		Student student3 =  new Student("Kevin",10,"CSE");
		student3.getDetails();
		
		
	}
}
