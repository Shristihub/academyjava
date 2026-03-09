package com.concurrent.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		String name = "Raju";
		//implementing Run method 
		Callable<Double> task1  = ()->{
			System.out.println("Welcome  "+Thread.currentThread().getName());
			//the task to be executed
			double interest = bank.calcInterest(name,10000);
			System.out.println("Interest to be paid "+interest);
			return interest;
		};
		
	  Callable<String> task2 = ()->{
		  System.out.println("Task-2 "+Thread.currentThread().getName());
		//the task to be executed
		  String message = bank.payBills("Cleaning Service ", 5);
//		  System.out.println(message);
		  return message;
	  };
	  
	  
	  ExecutorService executor = Executors.newFixedThreadPool(10);
	  Future<Double> future1 = executor.submit(task1);
	  Future<String> future2 = executor.submit(task2);
	  try {
		double interest = future1.get();
		System.out.println(interest);
		System.out.println();
		String result = future2.get();
		System.out.println(result);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
