package com.inter.def;

public class OnlineOrders implements IOrders {

	@Override
	public void placeOrder(String itemName, int quantity, double cost) {
		System.out.println("Online Order...");
		System.out.println("Item Ordered: "+itemName);
		System.out.println("Total Price: "+(quantity*cost));
	}

	@Override
	public void sendOrderConfirmation(String itemName) {
		IOrders.super.sendOrderConfirmation(itemName); // optional
		System.out.println("email send for confirmation");
	}
	

}
