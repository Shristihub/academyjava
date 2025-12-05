package com.excep.advanced;

public class Customer {

	public static void main(String[] args) throws Exception{
		Product product = new Product(10);
		
//		try {
			product.placeOrder("Pen",15,100);
			System.out.println("Order placed successfully");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
	}
}
