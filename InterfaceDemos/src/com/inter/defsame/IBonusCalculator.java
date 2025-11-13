package com.inter.defsame;

public interface IBonusCalculator {
	void calculate(double amount);
	
	default void processDetails() {
		System.out.println("Processing started for bonus");
	}
	
	static void showPolicy() {
		System.out.println("Policy varies for different branches");
	}
	

}
