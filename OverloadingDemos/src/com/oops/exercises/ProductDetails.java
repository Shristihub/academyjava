package com.oops.exercises;

public class ProductDetails {

	void payBill(String customerName, double totalAmount){
		System.out.println("Customer Name "+customerName);
		System.out.println("Total Amount "+totalAmount);
	}
	 void payBill(String customerName, double totalAmount,String... itemNames){
		 System.out.println("Customer Name "+customerName);
		 System.out.println("Total Amount "+totalAmount);
		 for (String itemName : itemNames) {
			System.out.println("Item Purchased "+itemName);
		}
	 }

	 void applyDiscount(String itemName,double basePrice, double... discounts){
		 System.out.println("Item Name "+itemName);
		 System.out.println("Original Price "+basePrice);
		 for (double discount : discounts) {
			basePrice-=discount;
		}
		 System.out.println("Final Price "+basePrice);
	 }

}
