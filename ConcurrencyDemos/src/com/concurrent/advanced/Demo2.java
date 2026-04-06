package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// thenRun()
		CompletableFuture.runAsync(() -> {
		
			System.out.println("do some task");
		})
		.thenRun(() -> System.out.println("Run after the task")); 
		
		//thenAccept()
		CompletableFuture.supplyAsync(() -> "Task completed")
				.thenAccept((str) -> System.out.println(str));// consume 
		
		//thenApply() and then 
		CompletableFuture.supplyAsync(() -> "Task completed")
		        .thenApply((str) -> str.toUpperCase()) // transform
				.thenAccept((str) -> System.out.println(str));// consume 


		CompletableFuture.runAsync(()->System.out.println("Final Result"))
		     .thenRun(()-> System.out.println("Run after")); // run another
		
		System.out.println("Great day");
	}

}
