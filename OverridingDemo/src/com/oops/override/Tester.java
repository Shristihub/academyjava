package com.oops.override;

public class Tester extends Employee {

	@Override
	void calcBonus(int amount) {
		System.out.println("Bonus for Tester "+(amount*2));
	}
	

}
