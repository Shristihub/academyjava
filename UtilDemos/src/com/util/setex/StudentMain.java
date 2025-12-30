package com.util.setex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
	
		List<Student> studentsList =  Arrays.asList(
				new Student("Raju",1,"Chennai"),
				new Student("Raju",1,"Chennai"),
				new Student("Raju",1,"Pune"),
				new Student("Ashok",2,"Pune"),
				new Student("Ashok",3,"Pune"),
				new Student("Rakesh",4,"Mysore")
				);
		// pass the list as parameter
		Set<Student> students = new HashSet<>(studentsList);
		students.add(new Student("Gokul",5,"Mysore"));
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		students = new LinkedHashSet<>(studentsList);
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		students = new TreeSet<>(studentsList);
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}











