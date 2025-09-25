package com.abs.ex3;

public class Developer extends Employee {

	@Override
	void calcBonus(double amount) {
		System.out.println("Dev Bonus "+amount*2);
	}

}
