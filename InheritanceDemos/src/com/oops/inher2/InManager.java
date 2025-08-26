package com.oops.inher2;

public class InManager extends InEmployee {

	double salary;
	
	public InManager(String employeeName, int employeeId, double salary) {
		super(employeeName, employeeId);
		this.salary = salary;
	}

	void calcBonus(double amount) {
		System.out.println("Bonus "+(amount+salary));
	}

}
