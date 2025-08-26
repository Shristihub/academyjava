package com.oops.inher2;

public class InEmployee {

	String employeeName;
	int employeeId;
	
	

	public InEmployee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public InEmployee(String employeeName, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	void getDetails() {
		System.out.println("Name "+employeeName);
		System.out.println("Id "+employeeId);
	}
}
