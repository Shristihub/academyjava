package com.oops.override;

public class Developer extends Employee {

	@Override
	void calcBonus(int amount) {
		System.out.println("Bonus for Dev"+(amount*3));
	}
	

}
