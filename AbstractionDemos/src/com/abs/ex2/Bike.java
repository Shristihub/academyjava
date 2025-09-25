package com.abs.ex2;

public class Bike extends Vehicle{

	@Override
	void getMileage() {
		System.out.println("Mileage for Bike");
	}

	@Override
	void showAccessories() {
		System.out.println("Bike cover, headlight");
	}

}
