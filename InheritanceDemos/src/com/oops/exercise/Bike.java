package com.oops.exercise;

public class Bike extends Vehicle {
	String transmissionType; // manual, automatic
	String category; // sports, Cruiser, Luxury

	public Bike(String brand, String model, double price, String transmissionType, String category) {
		super(brand, model, price);
		this.transmissionType = transmissionType;
		this.category = category;
	}

	// own method
	void printInfo() {
		getDetails();
		System.out.println("TransmissionType: " + transmissionType);
		System.out.println("This model " + model + " is a " + category + "bike");
	}
	// own method
	void addAccessories(String... accessories) {
		System.out.println("The accessories expected are");
		for (String accessory : accessories) {
			System.out.println("Acc " + accessory);
		}
	}

}
