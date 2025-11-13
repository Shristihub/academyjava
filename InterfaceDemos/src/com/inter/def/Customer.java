package com.inter.def;

public class Customer {

	public static void main(String[] args) {
		IOrders orders = new OnlineOrders();
		orders.placeOrder("Pen", 10, 200);
		orders.sendOrderConfirmation("Pen");
		
		System.out.println();
		orders = new InStoreOrders();
		orders.placeOrder("Study Table",1,5000);
		orders.sendOrderConfirmation("Study Table");
		// call using interface name only
		IOrders.showConditions();
	}
}
