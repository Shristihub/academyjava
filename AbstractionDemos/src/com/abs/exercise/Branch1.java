package com.abs.exercise;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Car Loan in Branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("Housing Loan in Branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("Educational Loan in Branch1");
	}
	//own method
	void depositTypes() {
		System.out.println("Recurring,short-term,long-term,fixed deposit");
	}

	
	

}
