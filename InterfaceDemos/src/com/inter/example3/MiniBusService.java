package com.inter.example3;

public class MiniBusService extends BusService{

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Canceling bus tickets");
		System.out.println("No of tickets Cancelled "+noOfTickets);
	}

}
