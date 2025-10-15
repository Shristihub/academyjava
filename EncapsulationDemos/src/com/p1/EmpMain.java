package com.p1;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.greet();
		//cannot access the private method of other class
//		employee.calcBonus();
		employee.printInfo(); //can access def/friendly access specifier
		employee.shareData(); //protected access specifier
	}

}
