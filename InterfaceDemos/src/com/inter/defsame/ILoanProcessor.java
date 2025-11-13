package com.inter.defsame;

public interface ILoanProcessor {
	void calculate(double amount);
	default void processDetails() {
		System.out.println("Processing started for loan");
	}

}
