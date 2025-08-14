package com.oops.overload;

public class ConstOverload {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.getDetails();
		Student student2 = new Student("Kevin");
		student2.getDetails();
		Student student3 = new Student("Jo",10);
		student3.getDetails();
		Student student4 = new Student("Raju","Bangalore");
		student4.getDetails();
		Student student5 = new Student("Sri",10,"Bangalore");
		student5.getDetails();
	}
}
