package com.inter.example2;

public class InterMain {

	public static void main(String[] args) {
		IInsurance insurance = new Car();
		insurance.getPolicyDetails();
		insurance.renewPolicy("A12345");

		IAccessories accessories = (IAccessories) insurance;
		accessories.getDiscount(1000);
		for (String accessory : accessories.showAccessories()) {
			System.out.println(accessory);
		}
	}
}
