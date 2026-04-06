package com.shristi.examples1;

public class Restaurant {

	String restaurantName;
	String type;
	String cuisine;
	
	
	
	public Restaurant(String restaurantName, String type, String cuisine) {
		super();
		this.restaurantName = restaurantName;
		this.type = type;
		this.cuisine = cuisine;
	}



	void getDetails(){
		System.out.println("Name "+restaurantName);
		System.out.println("Type "+type);
		System.out.println("Cuisine "+cuisine);
	}
}
