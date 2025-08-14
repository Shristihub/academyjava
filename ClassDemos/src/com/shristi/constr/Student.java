package com.shristi.constr;

public class Student {

	String studentName;
	int studentId;
	String department;

	Student(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public Student(String studentName, String department) {
		super();
		this.studentName = studentName;
		this.department = department;
	}

	public Student(String studentName, int studentId, String department) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
	}

	void getDetails() {
		if (studentName != null)
			System.out.println("Name " + studentName);
		if (studentId > 0)
			System.out.println("STudentId " + studentId);
		if (department != null)
			System.out.println("Department " + department);
	}
}






