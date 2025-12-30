package com.threads.sync;

public class TicketBooking {
	private double costPerTicket;
	private int availableTickets;

	public TicketBooking(double costPerTicket, int availableTickets) {
		super();
		this.costPerTicket = costPerTicket;
		this.availableTickets = availableTickets;
	}

	double bookTickets(String passengerName, int noOfTickets) {
		System.out.println("Booking done for: " + passengerName);
		System.out.println("Tickets to be booked " + noOfTickets);
		if (noOfTickets > availableTickets)
			throw new RuntimeException("tickets not available");
		// connect to db
		// check noof tickets.category
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double amountTobePaid = costPerTicket * noOfTickets;
		availableTickets -= noOfTickets;
		System.out.println("Total Price " + amountTobePaid);
		return amountTobePaid;
	}
}

















