package com.p1;

public class Employee {
	//everywhere
	public void greet() {
		System.out.println("Welcome to Java");
	}
	//only in the same class
	private void calcBonus() {
		System.out.println("Bonus calculation");
	}
	//only within the same package
	//any class in same package can access this
	void printInfo() {
		System.out.println("Printing..");
	}
	// package +kids
	//within the same package
	//sub class in other packages also can access this
	protected void shareData() {
		System.out.println("sharing...");
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.greet();
		employee.calcBonus();
		employee.printInfo();
		employee.shareData();
	}
}
