package com.inter.example3;

public class FlightService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Booking ticket for flight");
		System.out.println("Totla tickets booked "+noOfTickets);
	}

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Canceling flight tickets");
		System.out.println("Tickets Cancelled "+noOfTickets);
	}
	//own method
	void showFacilities() {
		System.out.println("Food and refreshment available");
	}

}




