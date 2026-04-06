package com.concurrent.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> productFuture = CompletableFuture.supplyAsync(() -> "ProductDetails: Laptop ");
		CompletableFuture<Double> priceFuture = CompletableFuture.supplyAsync(() -> 50000.0);

		CompletableFuture<String> combinedFuture = productFuture.thenCombine(priceFuture,
				(name, price) -> name + " Cost: " + price);

		combinedFuture.thenAccept(str -> System.out.println(str));

		CompletableFuture.supplyAsync(() -> {
			int x = 100;
			if (x > 50)
				throw new RuntimeException("number not valid");
			return x;
		}).exceptionally(ex -> {
			System.out.println(ex.getMessage());
			return 10;
		}).thenAccept(num->System.out.println(num));
		
		CompletableFuture.supplyAsync(() -> {
			    	String name="Priya";
					if (!name.startsWith("P"))
						throw new RuntimeException("Invalid name");
					return name;
			    }).handle((result, ex) -> {
			        if (ex != null) return ex.getMessage();
			        return result.toUpperCase();
			    }).thenAccept(System.out::println);
		
		
	}

}
