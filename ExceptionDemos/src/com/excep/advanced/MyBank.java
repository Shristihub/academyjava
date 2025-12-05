package com.excep.advanced;

public class MyBank {
	void withdraw(int amount)  throws Exception{
		System.out.println("In Bank");
		try {
			if(amount>5000)
				throw new Exception();
			int balance = 8000 - amount;
			System.out.println("Balance " + balance);
		} catch (Exception e) {
			System.out.println("technical error..");
			throw e; // throw Throwable instance
		} finally {
			System.out.println("close db");
		}

		System.out.println("Work done");
	}

}
