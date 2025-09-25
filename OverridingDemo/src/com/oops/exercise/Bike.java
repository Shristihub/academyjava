package com.oops.exercise;

public class Bike extends Vehicle{
	String transmissionType; //manual, automatic
	String category; //sports, Cruiser, Luxury
	public Bike(String model, String brand, double price, String transmissionType, String category) {
		super(model, brand, price);
		this.transmissionType = transmissionType;
		this.category = category;
	}
	@Override
	void getMileage() {
		System.out.println("Transmission type: "+transmissionType);
		System.out.println("Excellent mileage for bike");
	}
	//ownmethods
	   void doWheelie(){
		   System.out.println("Supports wheelie tasks");
	   }
	   void checkCategory(){
		   System.out.println("Bike Category: "+category+ " bike");
		   if(category.equalsIgnoreCase("road"))
			   System.out.println("Only for short road trips");
		   if(category.equalsIgnoreCase("mountain"))
			   System.out.println("can use for adventure trips");
		   if(category.equalsIgnoreCase("electric"))
			   System.out.println("can use for simple running");
	   }

	
}
