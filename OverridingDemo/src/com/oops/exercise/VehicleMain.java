package com.oops.exercise;

public class VehicleMain {

	public static void main(String[] args) {
		// super class ref =  sub class object
		Vehicle vehicle = new Car("City","Honda",1200000,"Sedan",5);
		// call all common methods using vehicle ref
		vehicle.getDetails();
		vehicle.getMileage();
		// own methods of car class
		Car car = (Car)vehicle;
		String[] accesories= car.showAccessories();
		for (String accessory : accesories) {
			System.out.println(accessory);
		}
		car.printFeatures();
		System.out.println();
		// make vehicle ref point to bike object
		vehicle =  new Bike("RS1","Yamaha",1000000,"automatic","Road");
		// call all common methods using vehicle ref
		vehicle.getDetails();
		vehicle.getMileage();
		// downcast to Bike to call the own methods
		Bike bike = (Bike)vehicle;
		bike.checkCategory();
		bike.doWheelie();
	}
}




