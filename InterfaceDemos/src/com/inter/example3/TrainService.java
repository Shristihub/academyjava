package com.inter.example3;

public class TrainService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Booking ticket for train");
		System.out.println("Totla tickets booked "+noOfTickets);
	}

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Canceling train tickets");
		System.out.println("Tickets Cancelled "+noOfTickets);
	}

}
