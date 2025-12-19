package com.inter.exercise;

public class DeveloperInterMain {

	public static void main(String[] args) {
		Employee employee = new Developer("Sri",1, "Goa", 20000);
		employee.printDetails();
		employee.calculateBonus(1000);
		
		IInsurance ins = employee;
		ins.calculatePremiun(2000, "Home Policy"); // from Developer
		IInsurance.policyDetails();//static method
		ins.choosePolicy(); // from IInsurance default
		
		IGamesClub gamesClub = employee;
		String[] indoorgames = gamesClub.indoorGames();
		for (String ingame : indoorgames) {
			System.out.println(ingame);
		}
		String[] outdoorgames = gamesClub.outdoorGames();
		for (String outgame : outdoorgames) {
			System.out.println(outgame);
		}
		
		IArtsClub artsClub = (IArtsClub)employee;
		artsClub.artsPrograms(); //from IArtsClub  default
		artsClub.learnPainting(); //from developer
		
		IMusicClub musicClub = (IMusicClub)employee;
		musicClub.learnInstrument(); //from developer
		IMusicClub.sessionsAvailable(); //IMusicClub
		
		IActivityClub activityClub = (IActivityClub)employee;
		activityClub.chooseActivity(); //from Developer
		IActivityClub.showActivities(); //static method
		
		Developer developer = (Developer)employee;
		developer.trainingDetails(); // own method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
