package com.oops.exercise;

public class Vehicle {

	String model;
	String brand;
	double price;
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	void getDetails() {
		System.out.println("Brand " + brand);
		System.out.println("Model " + model);
		System.out.println("Price " + price);
	}
	//method for overriding
	void getMileage() {
		System.out.println("Mileage details in Vehicle");
	}
	
}
