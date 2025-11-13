package com.bankapp.atm;

public abstract class Account {
	String accountHolder;
	double balance;
	//final variable - constant
	final double MINBALANCE=500;
	//static variable - common for all objects
	static String bankName;
	static {
		bankName ="ABC Bank";
	}
	public Account(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	//static method
	static void bankDetails() {
		System.out.println("Bank Name: "+bankName);
	}
	//final method
	final void showBankPolicy() {
		System.out.println("Min balnce required "+MINBALANCE);
	}
	//concrete method - return the balance
	double checkBalance() {
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	

}
