package com.lamb.productapp;

public class Billing {

	public static void main(String[] args) {
		
		Orders orders = new Orders();
		IPayment payment = new CardPayment();
		String status =  orders.processOrders(payment, "Head phones", 1, 10000);
		System.out.println(status);
		System.out.println();
		status =  orders.processOrders(payment, "Icecream", 20, 20);
		System.out.println(status);
		System.out.println();
		System.out.println();
		payment = new UpiPayment();
		String ustatus =  orders.processOrders(payment, "Head phones", 1, 10000);
		System.out.println(ustatus);
		System.out.println();
		ustatus =  orders.processOrders(payment, "Icecream", 20, 20);
		System.out.println(ustatus);
		
	}
}
