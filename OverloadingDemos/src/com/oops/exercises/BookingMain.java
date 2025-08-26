package com.oops.exercises;

public class BookingMain {

	public static void main(String[] args) {
		Booking booking =  new Booking();
		booking.bookTicket("Kevin", "Bangalore", "Mysore");
		System.out.println();
		booking.bookTicket("Kevin", "Bangalore", "Mysore","waterbottle","wakeupcall");
		System.out.println();
		booking.bookTicket("Kevin", "Bangalore", "Mysore",3);
		
		
	}
}
