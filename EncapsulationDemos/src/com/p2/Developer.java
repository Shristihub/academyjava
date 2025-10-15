package com.p2;
import com.p1.Employee;

public class Developer extends Employee{

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.greet();
//		employee.shareData(); // compiler error
		
		Developer developer = new Developer();
		developer.greet();
		developer.shareData(); // protected access specifier
		//cannot access the private method of other class
//		employee.calcBonus();
	}
}
