package com.abs.ex4;

public class NetBanking extends Payment{

	@Override
	void processPayment(double amount) {
		System.out.println("Payment using netbanking");
	}

	@Override
	void refund(double amount) {
		System.out.println("Amount refunded netbanking "+(amount-100));
	}
	

}
