package com.lamb.productapp;

public class BillingLambda {

	public static void main(String[] args) {
		
		Orders orders = new Orders();
		//implement using Lambda - equivalent to upi payment
		IPayment upi = amount->{
			System.out.println("Payment using upi "+amount);
			if(amount>5000)
				return "failed";
			return "success";
		};
		String status =  orders.processOrders(upi, "Head phones", 1, 10000);
		System.out.println(status);
		System.out.println();
		status =  orders.processOrders(upi, "icecream", 10, 10);
		System.out.println(status);
		System.out.println();

		String orderstatus =  orders.processOrders(amount->{
			System.out.println("Payment using card "+amount);
			if(amount<500)
				return "failed";
			return "success";
		}, "Television", 2, 30000);
		System.out.println(orderstatus);
		
	}
}




