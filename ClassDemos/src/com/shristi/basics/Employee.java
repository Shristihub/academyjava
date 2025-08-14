package com.shristi.basics;

public class Employee {

	String employeeName;
	int employeeId;
	double salary;
	static String companyName ="Shristi";
	
	
	public static void main(String[] args) {
//		create object
		Employee employee1 = new Employee();
		System.out.println(employee1.employeeName+" "+employee1.employeeId+" "+employee1.salary);
		System.out.println();
//		assign values
		employee1.employeeName ="Priya";
		employee1.employeeId=10;
		employee1.salary=2000;
		System.out.println("Name: "+employee1.employeeName);
		System.out.println("Id: "+employee1.employeeId);
		System.out.println("Salary: "+employee1.salary);
		System.out.println();
		//create the 2nd object
		Employee employee2 = new Employee();
		employee2.employeeName ="Raju";
		employee2.employeeId=20;
		employee2.salary=3000;
		System.out.println("Name: "+employee2.employeeName);
		System.out.println("Id: "+employee2.employeeId);
		System.out.println("Salary: "+employee2.salary);
		
		employee1.salary=4000;
		System.out.println("Salary: "+employee1.salary);
		
//		print the static variable
		System.out.println(Employee.companyName);
		Employee.companyName ="Shristi Tech Academy";
		System.out.println(Employee.companyName);
		
		System.out.println();
		Employee employee3 = employee2;
		System.out.println("Name: "+employee3.employeeName);
		System.out.println("Id: "+employee3.employeeId);
		System.out.println("Salary: "+employee3.salary);
		
		employee3.salary=5000;
		System.out.println("Emp3: "+employee3.salary);
		System.out.println("Emp2: "+employee2.salary);
		
		employee2 = null;
		System.out.println("Emp3: "+employee3.salary);
		System.out.println("Emp2: "+employee2.salary);


		
		
	}
}






