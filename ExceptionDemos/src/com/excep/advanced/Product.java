package com.excep.advanced;

public class Product {

	int stock;

	public Product(int stock) {
		super();
		this.stock = stock;
	}

	void placeOrder(String productName, int quantity, double cost) throws Exception {
		System.out.println("Product name " + productName);
		try {
			if (stock - quantity <= 0 || quantity <= 0 || quantity > stock) {
				throw new Exception("product out of stock");
			}
			double price = quantity*cost;
			System.out.println("Total amoun to be paid "+price);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			throw e;
		} finally {
			System.out.println("closing the database");
		}
		System.out.println("this will not called when exception occurs");
	}
}
