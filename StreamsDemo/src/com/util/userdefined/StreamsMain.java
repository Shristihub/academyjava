package com.util.userdefined;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsMain {

	public static void main(String[] args) {
		List<Employee> employees= Arrays.asList(
				new Employee("Raju",1,32000,"Bengaluru"),
				new Employee("Arav",2,18000,"Chennai"),
				new Employee("Bobby",3,40000,"Bengaluru"),
				new Employee("Zeena",4,1000,"Bengaluru"),
				new Employee("Joseph",5,12000,"Bengaluru"),
				new Employee("Priya",6,16000,"Chennai")
				);
		
		
		
		//1. Get the employees by city Bengaluru
		employees.stream()
		         .filter(emp->emp.getCity().equals("Bengaluru"))
		         .sorted(Comparator.comparing(Employee::getEmployeeName))
		         .forEach(System.out::println);
		
		System.out.println();
		//2. Get the sum of salaries of employees
		double sum = employees.stream()
//					.map(employee->employee.getSalary())
				    .map(Employee::getSalary)
					.reduce(0.0, (x,y)->x+y);
		System.out.println("Sum "+sum);
		
		//other way
		sum = employees.stream()
		.mapToDouble(employee->employee.getSalary())
//		.mapToDouble(sal->sal.doubleValue())
		.sum();
		System.out.println("Sum "+sum);
		
		
		//3. Get one employee by Id
		Optional<Employee> optemp =  employees.stream()
						.filter(employee->employee.getEmployeeId()==6)
						.findFirst();
		optemp.ifPresent(System.out::println);
		
		System.out.println();
		//4. Get the max salary of employee
		Employee empl = employees.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.get();
		System.out.println(empl);
		
		//other way
		double salary = employees.stream()
		  .mapToDouble(Employee::getSalary)
		  .max()
		  .getAsDouble();
		System.out.println("Max "+salary);
		System.out.println();
		
		//5. Get the employee names in alphabetical order
		employees.stream()
//			    .map(employee->employee.getEmployeeName())
		        .map(Employee::getEmployeeName)
		        .sorted()
		        .forEach(System.out::println);

		
	}
}







