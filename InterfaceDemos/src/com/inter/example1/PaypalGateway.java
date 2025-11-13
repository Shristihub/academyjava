package com.inter.example1;

public class PaypalGateway implements IPaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("processing payment using Paypal for "+amount);
	}

	@Override
	public void validatePayment(String transactionId) {
		System.out.println("Validating id using paypal "+transactionId);
	}

}
