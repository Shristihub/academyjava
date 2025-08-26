package com.oops.exercises;

public class Notification {

	void sendNotifications(String message) {
		System.out.println("Notification to all employees");
		System.out.println(message);

	}

	void sendNotifications(String message, String... employees) {
		System.out.println("Notification to specific employees");
		for (String employee : employees) {
			System.out.println("Message to "+employee +": "+message);
		}
	
	}

}





