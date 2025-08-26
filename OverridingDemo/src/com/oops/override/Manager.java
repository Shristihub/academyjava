package com.oops.override;

public class Manager extends Employee{

	@Override
	void calcBonus(int amount) {
		System.out.println("Bonus for Manager "+(amount*5));
	}
	
	void coursesAssigned() {
		System.out.println("Agile,Leadership");
	}
	

}
