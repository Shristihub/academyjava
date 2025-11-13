package com.inter.example1;

import java.util.Scanner;

public class PaymentService {

	public static void main(String[] args) {
		//interface ref = implementation class object
//		IPaymentGateway gateway = new PaypalGateway();
//		gateway.processPayment(2000.0);
//		gateway.validatePayment("A12345");
//		
//		gateway = new RazorPayGateway();
//		gateway.processPayment(2000.0);
//		gateway.validatePayment("A12345");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type p for paypal/r for razorpay");
		String choice = sc.next();
		IPaymentGateway gateway = null;
		if(choice.equalsIgnoreCase("p")) {
			System.out.println("Gateway sleected: Paypal");
			gateway = new PaypalGateway();
		}else if(choice.equalsIgnoreCase("r")){
			System.out.println("Gateway selected: Razorpay");
			gateway = new RazorPayGateway();
			RazorPayGateway razor = (RazorPayGateway) gateway;
			razor.logTransactions();
		}else {
			System.out.println("wrong choice");
			System.exit(0);
		}
		gateway.processPayment(2000.0);
		gateway.validatePayment("A12345");
		
	}
}














