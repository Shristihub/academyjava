package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle1 =  new Vehicle();
		vehicle1.getDetails();
		System.out.println();
		Vehicle vehicle2 =  new Vehicle("City");
		vehicle2.getDetails();
		System.out.println();
		Vehicle vehicle3 =  new Vehicle("Honda","Civic");
		vehicle3.getDetails();
		System.out.println();
		Vehicle vehicle4 =  new Vehicle("Audi","A123",220000);
		vehicle4.getDetails();
		
	}
}
