package com.oops.inher;

public class InherDemo {

	public static void main(String[] args) {
		Employee employee =  new Employee();
		employee.getDetails();
		System.out.println();
		Manager manager =  new Manager();
		manager.getDetails(); // super class method
		manager.calcBonus(2000); //own method
	}
}
