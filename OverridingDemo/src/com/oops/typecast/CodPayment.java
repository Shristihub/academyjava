package com.oops.typecast;

public class CodPayment extends Payment{

	@Override
	void processPayment(double amount) {
		System.out.println("Payment of amount "+amount+"using COD");
	}

	
}
