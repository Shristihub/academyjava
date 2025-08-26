package com.oops.typecast;

public class CreditCardPayment extends Payment{

	@Override
	void processPayment(double amount) {
		System.out.println("Payment of amount "+amount+"using credit card");
	}
	//own method
	void applyRewards(int points) {
		System.out.println("reward points applied and discount added");
	}
}
