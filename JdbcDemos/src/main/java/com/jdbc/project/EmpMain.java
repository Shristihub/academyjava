package com.jdbc.project;

public class EmpMain {

	public static void main(String[] args) {
		//interface ref = implementation class
		IEmployeeService employeeService =new EmployeeServiceImpl();
		//create an employee object and pass to addEmployee method
		Employee employee = new Employee(11, "Kevin", 2000, "Bengaluru");
		employeeService.addEmployee(employee);
		
		employeeService.getAllEmployees()
		 				.stream()
		 				.forEach(System.out::println);
			
	}
}
