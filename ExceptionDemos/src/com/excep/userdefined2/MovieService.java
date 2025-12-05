package com.excep.userdefined2;

public class MovieService {

	int totalAvailableTickets;
	String[] showTimes = { "10AM", "1PM", "3PM", "5PM" };

	public MovieService(int totalAvailableTickets) {
		super();
		this.totalAvailableTickets = totalAvailableTickets;
	}

	void bookTickets(int noofTickets, double costperTicket, String showTime, String movieName)
			throws InvalidBookingException, ShowTimeNotAvailableException, Exception {
		System.out.println("Booking ticket for " + movieName);
		boolean status = false;
		if (noofTickets > totalAvailableTickets)
			throw new InvalidBookingException("tickets not available");

		for (String st : showTimes) {
			if (st.equalsIgnoreCase(showTime)) {
				status = true;
				double price = costperTicket * noofTickets;
				System.out.println("Tickets booked " + noofTickets);
				System.out.println("Total price " + price);
			}
		}
		if (!status)
			throw new ShowTimeNotAvailableException("show time not available");

	}
}
