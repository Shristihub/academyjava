package com.oops.exercises;

public class NotifictaionMain {

	public static void main(String[] args) {
		Notification notification =  new Notification();
		notification.sendNotifications("FireDrill @10am");
		System.out.println();
		notification.sendNotifications("Meeting at 3pm", "Raju","Jo","Kevin");
		System.out.println();
		notification.sendNotifications("Internal Assessment tommorrow","Sri","Priya");
	}
}
