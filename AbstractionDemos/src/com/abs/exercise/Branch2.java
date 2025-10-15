package com.abs.exercise;

public abstract class Branch2 extends Bank{

	@Override
	void housingLoan() {
		System.out.println("Housing Loan in Branch2");		
	}

	@Override
	void eduLoan() {
		System.out.println("Education Loan in Branch2");		
	}
	
	//own method
	void loanTypes() {
		System.out.println("short-term,long-term loans");
	}

}
