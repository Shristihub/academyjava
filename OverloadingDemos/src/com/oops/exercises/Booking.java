package com.oops.exercises;

public class Booking {

	void bookTicket(String passengerName,String source, String destination) {
		System.out.println("PassenegerName "+passengerName);
		System.out.println("Source "+source);
		System.out.println("Destination "+destination);
	}
	void bookTicket(String passengerName,String source, String destination,String...amenities) {
		System.out.println("PassenegerName "+passengerName);
		System.out.println("Source "+source);
		System.out.println("Destination "+destination);
		for (String amenity : amenities) {
			System.out.println(amenity);
		}
	}
	void bookTicket(String passengerName,String source, String destination,int noOfTickets) {
		System.out.println("PassenegerName "+passengerName);
		System.out.println("Source "+source);
		System.out.println("Destination "+destination);
		System.out.println("No of Tickets "+noOfTickets);
	}
	
}




