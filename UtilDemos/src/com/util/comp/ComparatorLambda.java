package com.util.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Nandhu",10,"Pune",20860),
				new Employee("Raju",30,"Bengaluru",18760),
				new Employee("Raju",65,"Bengaluru",18760),
				new Employee("Zeena",12,"Bengaluru",18760),
				new Employee("Helen",1,"Bengaluru",8760),
				new Employee("Ajay",52,"Chennai",10060),
				new Employee("Irene",102,"Goa",4860),
				new Employee("Ria",32,"Chennai",25060)
				);
		System.out.println(employees);
		System.out.println();
		System.out.println("Sorting by employee name");
		
		// implementation of Comparator using Lambda expressions
		Comparator<Employee> comp = (Employee o1, Employee o2)->{
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		};
		
		Collections.sort(employees, comp);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Sorting by employee  id");
		Collections.sort(employees, (o1, o2)->{
			return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
		});
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Sorting by salary");
		Collections.sort(employees, (o1,o2)-> Double.compare(o1.getSalary(), o2.getSalary()));
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
















