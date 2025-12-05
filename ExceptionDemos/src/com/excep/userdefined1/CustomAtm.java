package com.excep.userdefined1;

public class CustomAtm {

	public static void main(String[] args) {

		System.out.println("Welcome to ABC Bank");

		CustomBank bank = new CustomBank(4000);
		try {
			bank.withdraw(400);
			System.out.println("Amount withdrawn successfully");
		} catch (OutofLimitsException e) {
			System.out.println("....error occured....");
			System.out.println(e.getMessage());
		} catch (NegativeBalanceException e) {
			System.out.println("....error occured....");
			System.out.println(e.getMessage());
		}

	}

}
