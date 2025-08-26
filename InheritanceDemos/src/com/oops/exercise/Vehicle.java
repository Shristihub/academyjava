package com.oops.exercise;

public class Vehicle {
	String brand;
	String model;
	double price;

	Vehicle(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Brand " + brand);
		System.out.println("Model " + model);
		System.out.println("Price " + price);
	}

}
