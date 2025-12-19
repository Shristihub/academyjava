package com.inter.exercise;

public class Developer extends Employee implements IArtsClub, IMusicClub {

	double salary;
	public Developer(String employeeName, int employeeId, String city, double salary) {
		super(employeeName, employeeId, city);
		this.salary=salary;
	}
    //IActivityCLub
	@Override
	public void chooseActivity() {
		System.out.println("dance, music,arts");
	}

	//IInsurance
	 @Override
	public void calculatePremiun(double amount, String policyName) {
		System.out.println("premium "+amount);
		System.out.println("policy "+policyName);
	}
	//IGamesClub
	@Override
	public String[] indoorGames() {
		return new String[] {"squash","tabletennis"};
	}
	 //IGamesClub
	@Override
	public String[] outdoorGames() {
		return  new String[] {"basketball","tennis"};
	}
	//IMusicClub
	@Override
	public void learnInstrument() {
		System.out.println("Learn string instrument- guitar, violin");
	}
	//IArtsClub
	@Override
	public void learnPainting() {
		System.out.println("Learn oil painting");
	}
	//Employee
	@Override
	void calculateBonus(double amount) {
		System.out.println("Bonus "+amount);
	}

	//own method
	void trainingDetails() {
		System.out.println("Softskills");
	}
}






