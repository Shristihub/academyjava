package com.abs.ex3;

public class Manager extends Employee {

	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus "+amount*5);
	}

}
