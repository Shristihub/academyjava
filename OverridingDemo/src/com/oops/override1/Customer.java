package com.oops.override1;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack to learn - java/react/python");
		String techstack = sc.next();
		Institute institute = null;
		switch(techstack.toUpperCase()) {
		case "JAVA":
			//super class ref = sub class object
			institute = new JavaFullStackTrainer();
			break;
		case "REACT":	
			institute = new MernTrainer();
			break;
		case "PYTHON":
			institute = new PythonTrainer();
			break;
		default:
			institute = new Institute();
		}
		String[] topics = institute.showTopics();
		for (String topic : topics) {
			System.out.println(topic);
		}
		
		
	}
}





