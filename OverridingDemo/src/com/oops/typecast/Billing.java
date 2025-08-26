package com.oops.typecast;

public class Billing {

	public static void main(String[] args) {

		//super class ref = sub class object
		Payment payment = new CodPayment();
		payment.processPayment(2000.0); // codpayment class
		payment.refund(2000.0); //payment class
		System.out.println();
		payment =  new UpiPayment();
		payment.processPayment(1200);
		payment.refund(200);
		
//		long x=10;
//		int y =(int)x;
//		downcasting to subclass ref
		UpiPayment upi = (UpiPayment)payment;
		upi.validateUpiId(1234);
		System.out.println();
		
		payment = new CreditCardPayment();
//		payment.processPayment(1400);
//		payment.refund(300);
//		
//		CreditCardPayment card = (CreditCardPayment)payment;
//		card.applyRewards(200);

		CreditCardPayment card = (CreditCardPayment) payment;
		card.processPayment(4000);
		card.refund(200);
		card.applyRewards(100);
	
	
	}

}







