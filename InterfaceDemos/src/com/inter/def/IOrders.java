package com.inter.def;

public interface IOrders {

	void placeOrder(String itemName, int quantity, double cost);
	
	// add new functionality to an existing interface
	// backward compatibility
	// can be overridden in the implementation
	default void sendOrderConfirmation(String itemName) {
		System.out.println("Order confirmed: "+itemName);
	}
	
	// add a common functionality for all implementation classes
	// cannot be overridden
	//call using interfacename.methodname
	static void showConditions() {
		System.out.println("Item not returnable");
		System.out.println("No refunds");
	}
}





