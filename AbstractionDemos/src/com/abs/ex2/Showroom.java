package com.abs.ex2;

public class Showroom {

	public static void main(String[] args) {
		Vehicle vehicle =  new Bike();
		vehicle.getMileage();
		vehicle.showAccessories();
		vehicle.getVehicles(); // method from vehicle class
		
		vehicle = new Car();
		vehicle.getMileage(); // from fourwheeler
		vehicle.showAccessories(); // from car
		vehicle.getVehicles(); //method from vehicle class
		
		//calling ONLY using car object
		System.out.println();
		//equivalent to FourWheeler wheeler = new Car();
		FourWheeler wheeler = (FourWheeler)vehicle;
		wheeler.getMileage();  // from fourwheeler
		wheeler.showAccessories(); // from Car class
		wheeler.getVehicles(); // from vehicle class
		wheeler.checkTypes(); // own method of fourwheeler
		
		
		System.out.println();
		// call using the car reference
		Car car = (Car)vehicle;
		car.printFeatures(); // own method of car
		
		//always use super class ref only to call these
		car.getMileage(); // from fourwheeler
		car.showAccessories();// from Car class
		car.checkTypes(); // own method of fourwheeler
		car.getVehicles();// own method of vehicle
		
		
		
	}
}






