package com.inter.extend;

public class UserDemo {

	public static void main(String[] args) {
	
//		interface ref = implementation class
		ICalculator calculator =  new BasicCalculator();
		calculator.add(10, 20);
		calculator.difference(30, 20);
		
		System.out.println();
		IScientific scientific = new ScientificCalculator();
		scientific.square(10);
		scientific.cube(2);
		scientific.add(20, 20);
		scientific.difference(4, 2);
	}

}
