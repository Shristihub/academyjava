package com.oops.exercise;

public class Showroom {

	public static void main(String[] args) {
		Car car =  new Car("Honda","City",1250000,"Sedan",4);
		car.getDetails();
		car.showFeatures();
		System.out.println();
		String[] accessories = car.showAccessories();
		for (String accessory : accessories) {
			System.out.println("Acc " + accessory);
		}
		System.out.println();
		Bike bike = new Bike("Harley", "XC256", 2000000, "automatic", "luxury");
		bike.printInfo();
		System.out.println();
		bike.addAccessories("Helmet","Dash Cam","Bike Cover");
	}
}



