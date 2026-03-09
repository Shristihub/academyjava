package com.concurrent.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorBankDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		String name = "Raju";
		//implementing Run method 
		Runnable task1  = ()->{
			System.out.println("Welcome  "+Thread.currentThread().getName());
			//the task to be executed
			double interest = bank.calcInterest(name,10000);
			System.out.println("Interest to be paid "+interest);
		};
		
	  Runnable task2 = ()->{
		  System.out.println("Task-2 "+Thread.currentThread().getName());
		//the task to be executed
		  String message = bank.payBills("Cleaning Service ", 5);
		  System.out.println(message);
	  };
		
		
		ExecutorService executorService =Executors.newFixedThreadPool(10);
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.shutdown(); //mandatory
	}
}
