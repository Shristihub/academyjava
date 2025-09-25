package com.abs.ex4;

public class CreditCardPayment extends CardPayment{

	@Override
	void processPayment(double amount) {
		System.out.println("Credit card payment");
	}
	
	// own method
	void showRewards() {
		System.out.println("big billion coupon available");
	}

}
