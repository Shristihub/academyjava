package com.util.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

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
		System.out.println("Sort by Employee Name");
		Comparator<Employee> nameSort = new NameSort();
		Collections.sort(employees, nameSort);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println("Sort by Employee Id");
		Collections.sort(employees, new IdSort());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Sort by Salary");
		Collections.sort(employees, new SalarySort());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	
		System.out.println();
		System.out.println("Sort by City");
		Collections.sort(employees, new CitySort());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

















