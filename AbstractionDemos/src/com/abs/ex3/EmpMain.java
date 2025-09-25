package com.abs.ex3;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee =  new Manager();
		employee.calcBonus(2000);
		employee = new Developer();
		employee.calcBonus(1000);
	}
}
