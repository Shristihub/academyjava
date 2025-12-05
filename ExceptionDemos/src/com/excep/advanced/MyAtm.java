package com.excep.advanced;

public class MyAtm {

	public static void main(String[] args) throws Exception {
		System.out.println("In ATM");
		MyBank mybank = new MyBank();
//		try {
			mybank.withdraw(10000);
			System.out.println("Amount withdrawn successfully");
//		} catch (Exception e) {
//			System.out.println("Try again after sometime....");
//		}
		
		System.out.println("Goodbye");
	}
}
