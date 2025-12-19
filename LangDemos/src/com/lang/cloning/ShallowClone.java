package com.lang.cloning;

public class ShallowClone {

	public static void main(String[] args) {
		Student student1 = new Student("Raju", 1, "CSE");
		// clone the object
		try {
			Student clonedStudent = student1.clone();
			System.out.println("Student " + student1);
			System.out.println("Cloned Student " + clonedStudent);

			clonedStudent.setStudentName("Rakesh");
			System.out.println("Student " + student1);
			System.out.println("Cloned Student " + clonedStudent);

			// comparing the memory address
			System.out.println(student1 == clonedStudent); // false
			System.out.println(student1.equals(clonedStudent)); // false
			System.out.println(student1.getClass() == clonedStudent.getClass()); // true

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}





