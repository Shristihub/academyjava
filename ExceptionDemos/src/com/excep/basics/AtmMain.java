package com.excep.basics;

public class AtmMain {

	public static void main(String[] args) {
		System.out.println("In ATM");
		Bank bank =  new Bank();
		try {
			bank.withdraw(0);
			System.out.println("Amount withdrawn successfully");
		} catch (Exception e) {
			System.out.println("Technical glitch.. try again");
		}
		System.out.println("Goodbye");
	}
}
