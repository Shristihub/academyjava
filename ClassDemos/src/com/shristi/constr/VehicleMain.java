package com.shristi.constr;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle1 =  new Vehicle("Honda","City",190000);
		vehicle1.getDetails();
		System.out.println();
		Vehicle vehicle2 =  new Vehicle("Audi","A123",220000);
		vehicle2.getDetails();
		
	}
}
