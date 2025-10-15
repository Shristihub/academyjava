package com.p2;

import com.p1.Employee;

public class Client {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.greet();
		//cannot access the private method of other class
//		employee.calcBonus();

	}

}
