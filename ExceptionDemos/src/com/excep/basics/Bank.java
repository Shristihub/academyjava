package com.excep.basics;

public class Bank {

	void withdraw(int amount) {
		System.out.println("In Bank");
		try {
			int balance = 8000/amount;
			System.out.println("Balance "+balance);
		} catch (ArithmeticException e) {
			System.out.println("Technical Error....");
		}finally {
			System.out.println("close the connection");
			System.out.println("close the files");
		}
		System.out.println("Work done");
	}
}
