package com.oops.typecast;

public class Payment {

	void processPayment(double amount) {
		System.out.println("Received amount "+amount);
		
	}
	void refund(double amount) {
		System.out.println("Amount refunded in Payment "+amount);
	}
}
