package com.p1;

public class Manager extends Employee{

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.greet();
		employee.printInfo(); // default or friendly access specifier
		employee.shareData(); //protected access specifier
		
		//subclass can access the method
		Manager manager = new Manager();
		manager.greet(); //public method
		//cannot access the private method of other class
//		employee.calcBonus();
		//can access default/friendly access specifier methods
		manager.printInfo();
		manager.shareData();//protected access specifier
	}
}




