package com.abs.ex4;

public abstract class Payment {

	abstract void processPayment(double amount);
	void refund(double amount) {
		System.out.println("Amount refunded "+amount);
	}
}
