package com.concurrent.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo1 {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 30;
		// implement call() method and return result 
		Callable<Integer> task1 = () -> {
			System.out.println("Adding two numbers");
			int sum = num1 + num2;
			return sum; //call method returns integer value
		};

		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(task1);
		try {
			Integer result = future.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Callable<String> task2=()-> "Have a great day"; // call method returns string value
		Future<String> future1 = executor.submit(task2);
		String msg = null;
		try {
			msg =future1.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);
		
	}
}





