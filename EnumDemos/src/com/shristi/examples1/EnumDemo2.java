package com.shristi.examples1;

public class EnumDemo2 {

	public static void main(String[] args) {
//		String type = Type.VEG.name();
		Restaurant restaurant = new Restaurant("The Udupi",Type.VEG.name(), Cuisines.SI.getCusine());
		restaurant.getDetails();
		
		restaurant = new Restaurant("Paradise",Type.NON_VEG.name(), Cuisines.NI.cuisineName); // NOt good approach
		restaurant.getDetails();
		
		
		
	}
}
