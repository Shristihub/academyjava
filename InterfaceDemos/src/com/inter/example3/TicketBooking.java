package com.inter.example3;

public class TicketBooking {

	public static void main(String[] args) {
		//interface ref = implementation class obj
		IBooking booking = new FlightService();
		booking.bookTicket(2);
		booking.cancelTicket(1);
		FlightService flight = (FlightService) booking;
		flight.showFacilities();
		System.out.println();
		
		booking = new TrainService();
		booking.bookTicket(5);
		booking.cancelTicket(2);
		System.out.println();
		
		booking =  new MiniBusService();
		booking.bookTicket(10); //Bus
		booking.cancelTicket(3); //Minibus
		
		
      
		
	
	}
}



