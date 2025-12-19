package com.inter.exercise;

public interface IArtsClub extends IActivityClub{
	
	void learnPainting();
	default void artsPrograms() {
		System.out.println("Weekend programs");
	}

}
