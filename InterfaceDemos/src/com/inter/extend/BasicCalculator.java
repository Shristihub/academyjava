package com.inter.extend;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Sum: "+(x+y));
	}

	@Override
	public void difference(double x, double y) {
		System.out.println("Diff: "+(x-y));
	}

}
