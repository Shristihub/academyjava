package com.concurrent.compfuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class BlockNonBlockDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	  System.out.println("Hello");
	  CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
		  System.out.println("Executing Task 1 - printed first");
	  });
	  future.get(); // blocking
	  System.out.println("This will be printed second");
	  
	 System.out.println();
	 
	 future = CompletableFuture.runAsync(()->{
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Executing Task 2");
	  }).thenRun(()->{
		  System.out.println("Exceute after the task is completed");
	  });
	 System.out.println("This may be printed first");
	 future.join(); 
	 
	
	
	  
	  
	  
	  
	  
	  
	}
}
