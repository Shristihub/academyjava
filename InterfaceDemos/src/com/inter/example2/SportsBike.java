package com.inter.example2;

public class SportsBike extends Bike {

	@Override
	public void getDiscount(double amount) {
		System.out.println("Discount applied for sports bike "+amount);

	}

	@Override
	public void renewPolicy(String policyNumber) {
		System.out.println("Policy renwed for sports bike "+policyNumber);
	}
	//own method of sportsbike
	void engineDetails() {
		System.out.println("Excellent capacity");
	}

}
