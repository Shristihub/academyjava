package com.inter.def;

public class InStoreOrders implements IOrders {

	@Override
	public void placeOrder(String itemName, int quantity, double cost) {
		System.out.println("InStore Order...");
		System.out.println("Item Ordered: "+itemName);
		System.out.println("Total Price: "+(quantity*cost));
		System.out.println("Free items added");
	}

}
