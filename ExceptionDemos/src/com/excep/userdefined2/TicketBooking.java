package com.excep.userdefined2;

public class TicketBooking {

	public static void main(String[] args) {
		System.out.println("Ticket booking system");
		MovieService movieService = new MovieService(10);
		try {
			movieService.bookTickets(2, 100,"5pm", "Tangled");
			System.out.println("Booking done");
		} catch (InvalidBookingException e) {
			System.out.println("error..."+e.getMessage());
		} catch (ShowTimeNotAvailableException e) {
			System.out.println("error... "+e.getMessage());
		} catch (Exception e) {
			System.out.println("technical error");
		}
		
		System.out.println("Goodbye");
	}

}
