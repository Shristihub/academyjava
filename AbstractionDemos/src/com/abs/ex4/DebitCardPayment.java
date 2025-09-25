package com.abs.ex4;

public class DebitCardPayment extends CardPayment{

	@Override
	void processPayment(double amount) {
		System.out.println("Debit card payment");
	}
	
	// own method
	void availableDiscounts() {
		System.out.println("only on festive sales");
	}

}
