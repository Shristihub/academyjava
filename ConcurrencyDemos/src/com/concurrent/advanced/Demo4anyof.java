package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo4anyof {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Starting the task");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Doing.....In progress");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Completed");
		
		CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1,future2,future3);
		anyFuture.thenAccept(str-> System.out.println(str));
		
		String result  = (String)anyFuture.get(); // whichever finishes first
		System.out.println(result);
		
	}

}
