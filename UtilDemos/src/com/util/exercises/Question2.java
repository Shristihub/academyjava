package com.util.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {
		Map<Department, List<Student>> studmap = new HashMap<>();
		Department department = new Department("CSE", 1);
		List<Student> csestudents = Arrays.asList(new Student("Raju", 10), new Student("Rakesh", 11),
				new Student("Rohan", 12));
		List<Student> ecestudents = Arrays.asList(new Student("Sara", 21), new Student("Sri", 22),
				new Student("Sanjay", 23));
		List<Student> itstudents = Arrays.asList(new Student("Deeksha", 21), new Student("David", 22),
				new Student("Dinesh", 23));

		studmap.put(department, csestudents);
		studmap.put(new Department("ECE", 2), ecestudents);
		studmap.put(new Department("IT", 3), itstudents);
		studmap.put(new Department("Civil", 4), null);

		System.out.println(studmap);
		Set<Map.Entry<Department, List<Student>>> entryset = studmap.entrySet();
		for (Map.Entry<Department, List<Student>> en : entryset) {
			System.out.println("Department: " + en.getKey().getDepartmentName());
			System.out.println("StudentList: ");
			List<Student> students = en.getValue();
			if (students != null)
				for (Student student : students) {
					System.out.println(student);
				}
			System.out.println();
		}

		System.out.println();
		Set<Department> departments = studmap.keySet();
		System.out.println(departments);
		for (Department ndepartment : departments) {
			System.out.println("Department Name: "+ndepartment.getDepartmentName());
			List<Student> students = studmap.get(ndepartment);
			List<Student> civilstudents = Arrays.asList(new Student("John", 21), new Student("Jane", 22));
			// check if students is null(value is null)
			if (students == null) {
				// call the method to assign value to a key - civil
				studmap.putIfAbsent(ndepartment, civilstudents);
				// retrieve the value from the key using get method
				students = studmap.get(ndepartment);
			}
			for (Student student : students) {
				System.out.println(student);
			}
			System.out.println();
		}
	}
}
