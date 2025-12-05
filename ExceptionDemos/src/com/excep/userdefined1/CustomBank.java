package com.excep.userdefined1;

public class CustomBank {

	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws OutofLimitsException, NegativeBalanceException {
		System.out.println("In Bank");
		try {
		if (amount > 5000)
			throw new OutofLimitsException("amount withdrawn is out of limits");
		if (balance - amount <= 0)
			throw new NegativeBalanceException("insufficient balance");
		}catch(OutofLimitsException e) {
			System.out.println("..exception occured..."+e.getMessage());
			throw e;
		}catch(NegativeBalanceException e) {
			System.out.println("..negative balance exception..."+e.getMessage());
			throw e;
		}finally {
			System.out.println("closing the resources");
		}
		balance = balance - amount;
		System.out.println("Balance " + balance);

	}
}
