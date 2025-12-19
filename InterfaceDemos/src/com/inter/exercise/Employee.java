package com.inter.exercise;

public abstract class Employee implements IInsurance, IGamesClub{
	String employeeName;
	int employeeId;
	String city;
	public Employee(String employeeName, int employeeId, String city) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
	}
	void printDetails() {
		System.out.println("Name "+employeeName);
		System.out.println("Id "+employeeId);
		System.out.println("City "+city);
	}
	abstract void calculateBonus(double amount);
	@Override
	public void calculatePremiun(double amount, String policyName) {
		System.out.println("Premiun for policy "+policyName+" is "+amount);		
	}
	
	
}






