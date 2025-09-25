package com.abs.ex4;

public class BillingMain {

	public static void main(String[] args) {
		Payment payment = new NetBanking();
		payment.processPayment(2000); // from netbanking
		payment.refund(1000); // from netbanking
		System.out.println();
		
		payment = new CreditCardPayment();
		payment.processPayment(5000); //from cc
		payment.refund(1000); // from payment
		System.out.println();
		
		//ownmethod of CardPayment
		CardPayment cardPayment = (CardPayment)payment;
		cardPayment.showCardTypes(); // from cardpayment
		cardPayment.processPayment(5000); //from cc
		cardPayment.refund(1000); // from payment
		System.out.println();
		
		//own method of cc
		CreditCardPayment cc = (CreditCardPayment)cardPayment;
		cc.showRewards();
		System.out.println();
		
		payment = new DebitCardPayment();
		payment.processPayment(5000); //from dc
		payment.refund(1000); // from payment
	System.out.println();
		DebitCardPayment dc = (DebitCardPayment)payment;
		dc.availableDiscounts(); // own method of dc
		
		
		
		
		
		
		
		
		
		
		
	}
}
