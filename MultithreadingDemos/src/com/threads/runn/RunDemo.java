package com.threads.runn;

class TaskRunner implements Runnable{
	String name; double amount;
	Bank bankobj;
	public TaskRunner(String name, double amount, Bank bankobj) {
		super();
		this.name = name;
		this.amount = amount;
		this.bankobj = bankobj;
		Thread t= new Thread(this,name);
		System.out.println(t);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("Welcome  "+Thread.currentThread().getName());
		// all threads are sharing the same bank reference
		//call the method Bank
		double interest = bankobj.calcInterest(name,amount);
		System.out.println("Interest to be paid "+interest);
	}
}
public class RunDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		// these are simple java objects
		TaskRunner runner1 = new TaskRunner("Raju", 10000,bank);
		TaskRunner runner2 = new TaskRunner("Roni", 18000,bank);
		TaskRunner runner3 = new TaskRunner("Nandhu", 24000,bank);
	}

}




