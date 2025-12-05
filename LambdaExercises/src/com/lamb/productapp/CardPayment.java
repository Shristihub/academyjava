package com.lamb.productapp;

public class CardPayment implements IPayment {

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using card "+amount);
		if(amount<500)
			return "failed";
		return "success";
	}

}
