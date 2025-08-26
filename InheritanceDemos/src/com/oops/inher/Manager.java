package com.oops.inher;

public class Manager extends Employee{

	double salary;
	Manager(){
		employeeName="Kevin";
		employeeId=12;
		salary=4000;
	}
	void calcBonus(double amount) {
		System.out.println("Bonus "+(amount+salary));
	}
}
