package com.excep.userdefined;

public class OnlineShopping {

	public static void main(String[] args) {
		OrderService orderService = new OrderService(50);
		try {
			orderService.placeOrder("pen", 51, 10);
			System.out.println("Order placed successfully");
		} catch (OutOfStockException e) {
			System.out.println("Error ...." + e.getMessage());
		} catch (ExceedingLimitsException e) {
			System.out.println("Exception..."+e.getMessage());
		}
		System.out.println("Happy shopping");
	}
}
