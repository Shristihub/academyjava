package com.threads.runn;

class NewTask implements Runnable {
	String name;
	double amount;
	Bank bankobj;

	public NewTask(String name, double amount, Bank bankobj) {
		super();
		this.name = name;
		this.amount = amount;
		this.bankobj = bankobj;
		Thread t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}

	@Override
	public void run() {
//		synchronized (bankobj) {
			System.out.println("Welcome  " + Thread.currentThread().getName());
			// all threads are sharing the same bank reference
			// call the method Bank
			double interest = bankobj.calcInterest(name, amount);
			System.out.println("Interest to be paid " + interest);
//		}
		System.out.println();
	}
}

public class SyncDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// these are simple java objects
		NewTask runner1 = new NewTask("Raju", 10000, bank);
		NewTask runner2 = new NewTask("Roni", 18000, bank);
		NewTask runner3 = new NewTask("Nandhu", 24000, bank);
	}

}
