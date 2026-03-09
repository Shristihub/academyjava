package com.concurrent.advanced;

public class Bank {
	// task1
	synchronized double calcInterest(String name, double amount) {
		System.out.println("Welcome to ABC Bank " + name);
		System.out.println("Calculating interest for " + amount);
		double interest = amount * 5 * 2 / 100;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Interest: " + interest);

		return interest;
	}

	// task2
	public String payBills(String type, int days) {
		System.out.println("Paying bills for " + type);
		double amount = days * 2000;
		return "Paid for service " + type + " amount: " + amount;
	}
}
