package com.inter.defsame;

public class DefDemo {

	public static void main(String[] args) {
		ILoanProcessor processor = new EmployeeDetails();
		processor.calculate(2000); // abstract -f rom EmployeeDetails
		processor.processDetails(); // default - from EmployeeDetails
		
		IBonusCalculator calculator = (IBonusCalculator) processor;
		calculator.calculate(3000); //abstract - from EmployeeDetails
		calculator.processDetails();// default - from EmployeeDetails
		
		IBonusCalculator.showPolicy();
	}
}
