package com.inter.exercise;

public class ManagerInterMain {

	public static void main(String[] args) {
		// super class ref =  sub class object
		Employee employee = new Manager("Raj", 10,"Bengaluru","Mktg");
		employee.printDetails();
		employee.calculateBonus(4000);
		
		//IInsurance - // interface ref =  implementation class
		IInsurance ins = employee;
		ins.calculatePremiun(2000, "Health Insurance"); //from employee class
		ins.choosePolicy(); // from Manager default method
		IInsurance.policyDetails(); //static method
		
		IGamesClub gamesClub = employee;
		String[] indoorgames = gamesClub.indoorGames();
		for (String ingame : indoorgames) {
			System.out.println(ingame);
		}
		String[] outdoorgames = gamesClub.outdoorGames();
		for (String outgame : outdoorgames) {
			System.out.println(outgame);
		}
		
		IActivityClub activityClub = (IActivityClub)employee;
		activityClub.chooseActivity(); // from Manager
		IActivityClub.showActivities(); //static method
		
		IArtsClub artsClub = (IArtsClub)employee;
		artsClub.artsPrograms(); //default method from IARtsClub
		artsClub.learnPainting();// from Manager
		
		// own method of Manager
		Manager manager =(Manager) employee;
		manager.learnCourses(); // from Manager
	}
}



























