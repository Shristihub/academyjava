package com.lamb.productapp;

public class Orders {

	String processOrders(IPayment payment,String productName,int quantity, double cost) {
		System.out.println("Processing orders");
		System.out.println("Product Name: "+productName);
		double totalPrice = cost*quantity;
		System.out.println("Amount to be paid: "+totalPrice);
		String status = payment.processPayment(totalPrice);
		if(status.equals("success"))
			return "Order Shipped";
		else
			return "Order not shipped as payment failed";
	}
}
