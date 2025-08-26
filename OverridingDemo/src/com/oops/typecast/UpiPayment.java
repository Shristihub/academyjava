package com.oops.typecast;

public class UpiPayment extends Payment{

	@Override
	void processPayment(double amount) {
		System.out.println("Payment of amount "+amount+"using upi");
	}
   // own method
	void validateUpiId(int upiId) {
		System.out.println("validate upiId "+upiId);
	}
}
