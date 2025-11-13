package com.inter.example2;

public class Car implements IInsurance, IAccessories {

	@Override
	public String[] showAccessories() {
		return new String[] {"car cover","music system, rear ac"};
	}

	@Override
	public void getDiscount(double amount) {
		System.out.println("Discount applied "+amount);
	}

	@Override
	public void getPolicyDetails() {
		System.out.println("Policy for parts and engines");
	}

	@Override
	public void renewPolicy(String policyNumber) {
		System.out.println("Policy renewed"+policyNumber);
	}

}



