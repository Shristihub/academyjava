package com.oops.overload;

public class Vehicle {

	String brand;
	String model;
	double price;
	public Vehicle() {
		super();
		System.out.println("No args");
	}
	public Vehicle(String model) {
		this();
		System.out.println("one arg "+model);
		this.model = model;
	}
	public Vehicle(String brand, String model) {
		this(model);
		this.brand = brand;
		System.out.println("two args "+model+" "+brand);
	}
	public Vehicle(String brand, String model, double price) {
	    this(brand, model);
	    this.price = price;
		System.out.println("three args "+model+" "+price+" "+brand);
	}
	void getDetails() {
		if (brand != null)
			System.out.println("brand " + brand);
		if (price > 0)
			System.out.println("price " + price);
		if (model != null)
			System.out.println("model " + model);
	}
	
	
	
	
}
