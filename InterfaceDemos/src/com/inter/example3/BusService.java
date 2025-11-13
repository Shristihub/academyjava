package com.inter.example3;

public abstract class BusService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Booking ticket for bus");
		System.out.println("Totla tickets booked "+noOfTickets);
	}

	

}
