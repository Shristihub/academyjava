package com.inter.example1;

public class RazorPayGateway implements IPaymentGateway{

	@Override
	public void processPayment(double amount) {
		System.out.println("processing payment using Razorpay for "+amount);
	}

	@Override
	public void validatePayment(String transactionId) {
		System.out.println("Validating id "+transactionId);
	}
	//own method
	void logTransactions() {
		System.out.println("transaction for the past month");
	}

}
