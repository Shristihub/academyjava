package com.concurrent.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
		
		Callable<Integer> task1 = ()->{
			System.out.println("Adding two numbers");
			return 10+20;
		};
		ExecutorService executor = Executors.newFixedThreadPool(10);
//		executor.submit(()->"have a great day");
		
		Future<Integer> future =  executor.submit(task1);
//		System.out.println("cancel "+future.cancel(false)); //true
		System.out.println("isCancelled? "+future.isCancelled()); //true
		System.out.println("isDone "+future.isDone()); // true
		int sum=0;
		try {
			sum = future.get();
			System.out.println("cancel "+future.cancel(true)); //false
			System.out.println("isCancelled? "+future.isCancelled()); //false
			System.out.println("isDone "+future.isDone()); // true
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Sum "+sum);
		
	}
}
