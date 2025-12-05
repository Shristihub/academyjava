package com.excep.userdefined;

public class OrderService {
	int stock;

	public OrderService(int stock) {
		super();
		this.stock = stock;
	}

	void placeOrder(String productName, int quantity, double cost)
			throws OutOfStockException, ExceedingLimitsException {
		System.out.println("ProductName " + productName);
		if (quantity > 100) {
			throw new ExceedingLimitsException("quantity limit allowed: 100");
		}
		if (stock - quantity <= 0 || quantity > stock) {
			throw new OutOfStockException("stock not available");
		}
		double price = quantity * cost;
		System.out.println("Total amount to be paid " + price);

	}
}
