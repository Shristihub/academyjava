package com.bankapp.atm;

public class Savings extends Account{
	double interest=1000;

	public Savings(String accountHolder, double balance, double interest) {
		super(accountHolder, balance);
		this.interest = interest;
	}

	@Override
	void withdraw(double amount) {
		//write logic for this
		// withdraw amount from this class means
		//deduct 100Rs balance-amount-100;
		
	}

	@Override
	void deposit(double amount) {
		//deposit to saving account,add extra interest
		
	}
	//own method
	public String[] depositTypes() {
//		return a list of deposits- fixed, recurring, term
	  return null;
	
	}
}
