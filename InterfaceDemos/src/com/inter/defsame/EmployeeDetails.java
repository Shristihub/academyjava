package com.inter.defsame;

public class EmployeeDetails implements ILoanProcessor, IBonusCalculator {

	@Override
	public void calculate(double amount) {
		System.out.println("Calculating..."+amount);
	}
   // should override the default method
	@Override
	public void processDetails() {
		ILoanProcessor.super.processDetails();
		System.out.println("Processing started for employee");
		System.out.println("will be sanctioned in a month");
		IBonusCalculator.super.processDetails();
		System.out.println("Bonus for diwali");
	}

	


}
