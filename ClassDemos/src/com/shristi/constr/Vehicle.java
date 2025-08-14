package com.shristi.constr;

public class Vehicle {

	String brand;
	String model;
	double price;
	
//	Vehicle(){
//		brand = "Honda";
//		model="City";
//		price=190000;
//	}
	
	Vehicle(String brand,String model, double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	
	
	void getDetails() {
		System.out.println("Brand "+brand);
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
}


