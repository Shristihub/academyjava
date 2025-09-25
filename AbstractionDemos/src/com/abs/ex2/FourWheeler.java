package com.abs.ex2;

public abstract class FourWheeler extends Vehicle{
	
	//implicit abstract method showAccessories() available
	// make this class as abstract
	
	@Override
	void getMileage() {
		System.out.println("Four wheeler mileage");
	}
	
	//own method
	void checkTypes() {
		System.out.println("Car,truck,tempo");
	}
	
	
}
