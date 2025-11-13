package com.inter.example2;

public class BikeMain {

	public static void main(String[] args) {
		//Bike is abstract so point to sportsbike
		IInsurance insurance =  new SportsBike();
		insurance.getPolicyDetails(); //bike class
		insurance.renewPolicy("B5555"); //sportsbike class
		
		//downcast
		IAccessories accessories  = (IAccessories)insurance;
		accessories.getDiscount(2000); //sportsbike class
		//bike class
		for (String accessory : accessories.showAccessories()) {
			System.out.println(accessory);
		}
		//downcast
		SportsBike sportsBike =  (SportsBike) accessories;
		sportsBike.bikeTypes(); // own method of bike
		sportsBike.engineDetails();// own method of sportsbike
		
		//Bike ref = new SportsBike(); super classref= sub class object
		Bike bike =  (SportsBike) accessories;
		bike.bikeTypes(); // own method of bike
		
	}
}







