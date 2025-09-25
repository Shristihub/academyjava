package com.abs.ex4;

public abstract class CardPayment extends Payment{

	// implicit processPayment available here
	// own method
	void showCardTypes() {
		System.out.println("VISA,MASTER");
	}
}
