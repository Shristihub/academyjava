package com.inter.exercise;

public class Manager extends Employee implements IArtsClub{

	String department;

	public Manager(String employeeName, int employeeId, String city, String department) {
		super(employeeName, employeeId, city);
		this.department = department;
	}
	//IGamesClub
	@Override
	public String[] indoorGames() {
		return new String[] {"chess","carrom"};
	}
//	IGamesClub
	@Override
	public String[] outdoorGames() {
		return new String[] {"cricket","football"};
	}
//	Employee
	@Override
	void calculateBonus(double amount) {
		System.out.println("Bonus "+amount*2);
	}
	//overriding the deafult method in IInsurance
	@Override
	public void choosePolicy() {
		System.out.println("Policy for vehicles");
	}
	// own method for Manager
	void learnCourses() {
		System.out.println("cloud computing");
	}
	//IActivityCLub - super interface
	@Override
	public void chooseActivity() {
		System.out.println("Choose Yoga and Arts");
	}
	//IArtsClub
	@Override
	public void learnPainting() {
		System.out.println("learn acrylic painting");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
