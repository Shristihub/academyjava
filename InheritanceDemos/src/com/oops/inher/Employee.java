package com.oops.inher;

public class Employee {

	String employeeName;
	int employeeId;
	public Employee() {
		employeeName = "Raju";
		employeeId = 10;
	}
	void getDetails() {
		System.out.println("Name "+employeeName);
		System.out.println("Id "+employeeId);
	}
	
}
