package com.inter.example2;

public abstract class Bike implements IAccessories, IInsurance{

	@Override
	public void getPolicyDetails() {
		System.out.println("Policy only for engines");
	}

	@Override
	public String[] showAccessories() {
		return new String[] {"bike cover,dashcam"};
	}
	//own
	void bikeTypes() {
		System.out.println("Sports, adventure bikes");
	}

}
