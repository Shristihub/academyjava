package com.inter.exercise;

public interface IInsurance {

	void calculatePremiun(double amount, String policyName);

	static void policyDetails() {
		System.out.println("Policy for all employees ");
	}

	default void choosePolicy() {
		System.out.println("Policy for health");
	}
}
