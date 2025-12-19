package com.inter.exercise;

public interface IMusicClub extends IActivityClub{
	
	void learnInstrument();
	static void sessionsAvailable() {
		System.out.println("Weekends evening");
	}

}
