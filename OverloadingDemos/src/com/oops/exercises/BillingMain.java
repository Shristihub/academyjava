package com.oops.exercises;

public class BillingMain {

	public static void main(String[] args) {
		ProductDetails details =  new ProductDetails();
		details.payBill("Sri", 2000);
		System.out.println();
		details.payBill("Priya", 2000, "Bottle","Pen","Jacket");
		System.out.println();
		details.payBill("Raju", 12000, "Speaker","HeadPhones");
		System.out.println();
		details.applyDiscount("Jacket", 2000, 100,300,50);
		
	}
}
