package com.inter.example1;

public interface IPaymentGateway {

	void processPayment(double amount);
	void validatePayment(String transactionId);
}
