package com.concurrent.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorBankDemo1 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String name = "Raju";

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		System.out.println("in main1");
		// implementing Run method of Runnable inside execute
		executorService.execute(() -> {
			System.out.println("Welcome  " + Thread.currentThread().getName());
			// the task to be executed
			double interest = bank.calcInterest(name, 10000);
			System.out.println("Interest to be paid " + interest);
		});
		System.out.println("in main2");
		executorService.execute(() -> {
			System.out.println("Task-2 " + Thread.currentThread().getName());
			// the task to be executed
			String message = bank.payBills("Cleaning Service ", 5);
			System.out.println(message);
		});

		System.out.println("in main3");
		executorService.shutdown(); // mandatory
	}
}
