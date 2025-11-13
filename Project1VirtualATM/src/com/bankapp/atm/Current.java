package com.bankapp.atm;

public class Current extends Account {
	double OverDraftLimit = 10000;
	public Current(String accountHolder, double balance, double overDraftLimit) {
		super(accountHolder, balance);
		OverDraftLimit = overDraftLimit;
	}

	@Override
	void withdraw(double amount) {
//		logic for withdraw balance=balance-amount
	}

	@Override
	void deposit(double amount) {
//		logic for withdraw 
	}
	// ownmethod
	void printODLimits() {
		System.out.println("Amount allocated for OD "+OverDraftLimit);
	}

}





