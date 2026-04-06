package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Starting the task");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Doing.....In progress");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Completed");
		
		CompletableFuture<Void> allFuture = CompletableFuture.allOf(future1,future2,future3);
		allFuture.get();// waits for all three to finish
		
//		use thenRun - then manually get each future's result
		allFuture.thenRun(() -> {
		    try {
		        System.out.println(future1.get());
		        System.out.println(future2.get());
		        System.out.println(future3.get());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}).get();
		
		
	}

}
