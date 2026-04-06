package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo1nonblock {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture.runAsync(() -> {
			System.out.println("do some task");
		})
		.thenRun(() -> System.out.println("Run after the task")); //non-blocking
		System.out.println("This may be printed first");

		CompletableFuture.supplyAsync(() -> {
			//simulate db call
			return "Task returning result";
		})
		.thenAccept(str -> System.out.println(str)); //consumes result
 		
		
		System.out.println("great day"); // may print first

	}

}
