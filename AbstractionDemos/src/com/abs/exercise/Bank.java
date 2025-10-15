package com.abs.exercise;

public abstract class Bank {
	
	public final double BONUS = 2000;
	
	abstract void carLoan();
	abstract void housingLoan();
	abstract void eduLoan();
	
	//concrete method
	void adminDetails() {
		System.out.println("Main office in Bangalore");
	}
	
	// final methods cannot be overridden
	final void companyRules() {
		System.out.println("company rules");
	}

}
