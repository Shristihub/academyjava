package com.oops.exercise;

public class Car extends Vehicle {
	String type; //sedan, SUV,Hatchback,Coupe 
	int seatingCapacity;
	public Car(String model, String brand, double price, String type, int seatingCapacity) {
		super(model, brand, price);
		this.type = type;
		this.seatingCapacity = seatingCapacity;
	}
	@Override
	void getMileage() {
//		super.getMileage();
		System.out.println("Car Mileage is good");
	}
	//own methods
	 String[] showAccessories(){
		 return new String[] {"music system","car cover","dashcam"};
	 }
	 void printFeatures(){
		 System.out.println("Seating Capacity: "+seatingCapacity);
		 System.out.println("Car Type: "+type);
		 getDetails();
	 }
	
	
}
