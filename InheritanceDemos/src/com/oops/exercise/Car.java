package com.oops.exercise;

public class Car extends Vehicle {

	String type; // sedan, SUV,Hatchback,Coupe
	int seatingCapacity; // 4, 5,7,8

	public Car(String brand, String model, double price, String type, int seatingCapacity) {
		super(brand, model, price);
		this.type = type;
		this.seatingCapacity = seatingCapacity;
	}

	// own method
	String[] showAccessories() {
		return new String[] { "Car cover", "music system", "Seat Cover" };
	}

	// own method
	void showFeatures() {
		System.out.println("This model " + model + " is of type " + type);
		System.out.println("Seating Capacity: " + seatingCapacity);
	}

}
