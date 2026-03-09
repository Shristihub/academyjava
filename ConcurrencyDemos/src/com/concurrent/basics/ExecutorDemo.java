package com.concurrent.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {
		//creates a fixed thread pool and returns an ExecutorService ref
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		//execute the task
		executor.execute(new Task());
		
		ExecutorService executor1 =  Executors.newFixedThreadPool(10);
		//execute the task
		for (int i = 0; i < 50; i++) {
			executor.execute(new Task());
		}
		System.out.println("In main");
		
		try {
			executor.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
	
	}
}
