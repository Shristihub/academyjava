package com.abs.ex2;

public class Car extends FourWheeler{

	@Override
	void showAccessories() {
		System.out.println("car cover, music system");
	}
	
	// own method
	void printFeatures() {
		System.out.println("Sedan with 5 seating capacity");
	}

}
