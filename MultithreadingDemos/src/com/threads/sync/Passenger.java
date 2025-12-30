package com.threads.sync;

// task to be performed - bookTickets by calling TicketBooking class
class Counter implements Runnable {
	String passengerName;
	int noOfTickets;
	TicketBooking booking;
	Thread t;

	public Counter(String passengerName, int noOfTickets, TicketBooking booking) {
		super();
		this.passengerName = passengerName;
		this.noOfTickets = noOfTickets;
		this.booking = booking;
		// create a thread
		t = new Thread(this, passengerName);
		t.start();
	}

	@Override
	public void run() {
		synchronized (booking) {
			System.out.println("Welcome to OnlineTicket Booking");
			System.out.println("Hello " + Thread.currentThread().getName());
			double amount = booking.bookTickets(passengerName, noOfTickets);
			System.out.println("Payment: " + amount);
			System.out.println("Ticket booked successfully");
		}
		System.out.println();
	}

}

public class Passenger {

	public static void main(String[] args) {
		// share one TicketBooking class object
		TicketBooking booking = new TicketBooking(200, 20);
		// each passenger goes to separate counters
		Counter counter1 = new Counter("Raju", 2, booking);
		Counter counter2 = new Counter("Nandhu", 10, booking);
		Counter counter3 = new Counter("Ria", 10, booking);
		
		
		try {
			counter1.t.join();
			counter2.t.join();
			counter3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Task completed");
	}
}
