package com.oops.override;

import java.util.Scanner;

public class EmpPortal {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Designation - M/D/T");
		String desg = sc.next();
		System.out.println("Enter amount");
		int amount = sc.nextInt();
		if (desg.equalsIgnoreCase("M")) {
			// super class ref = sub class object
			employee = new Manager();
			Manager manager = (Manager) employee;
			manager.coursesAssigned(); // own method
		}
		if (desg.equalsIgnoreCase("D")) {
			employee = new Developer();
		}
		if (desg.equalsIgnoreCase("T")) {
			employee = new Tester();
		}
		employee.calcBonus(amount);
		

	}

}
