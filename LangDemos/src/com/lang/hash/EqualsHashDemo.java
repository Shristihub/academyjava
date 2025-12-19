package com.lang.hash;

public class EqualsHashDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Raju", 1,"Bengaluru","Mktg");
		Employee employee2 = new Employee("Raju", 1,"Bengaluru","Mktg");
		Employee employee3 = new Employee("Raju", 1,"Pune","Admin");
		Employee employee4 = new Employee("Raju", 2,"Bengaluru","Mktg");
		Employee employee5 = new Employee("Tom", 3,"Pune","Admin");
		
		System.out.println("e1 "+employee1.hashCode());
		System.out.println("e2 "+employee2.hashCode());
		System.out.println("e3 "+employee3.hashCode());
		System.out.println("e4 "+employee4.hashCode());
		System.out.println("e5 "+employee5.hashCode());
		
		System.out.println("e1 & e2 " + employee1.equals(employee2));
		System.out.println("e1 & e3 " + employee1.equals(employee3));
		System.out.println("e1 & e4 " + employee1.equals(employee4));
		System.out.println("e1 & e5 " + employee1.equals(employee5));
		
		
		
	}
}
