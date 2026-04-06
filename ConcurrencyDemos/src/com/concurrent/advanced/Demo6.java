package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo6 {

		static CompletableFuture<String> getUserById(int userId){
			CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(()->{
				//make db calls
				return "Jo";
			});
			return userFuture;
		
		}
		static CompletableFuture<String> getOrders(String username){
			CompletableFuture<String> orderFuture = CompletableFuture.supplyAsync(()->{
				//make db calls
				return username +" has 3 orders";
			});
			return orderFuture;
		}

		public static void main(String[] args) throws InterruptedException, ExecutionException {
			String uname = getUserById(1)
			 .thenCompose(user->getOrders(user))
			 .get();
			System.out.println(uname);
		}
		
		
}














