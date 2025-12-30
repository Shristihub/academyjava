package com.util.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				new Product("Mobile",12,8000,"Electronics"),
				new Product("Pen",20,400,"Stationary"),
				new Product("Speakers",82,8000,"Electronics"),
				new Product("11Xbox",180,4000,"Electronics"),
				new Product("Bottle",10,800,"Sports")
				);
		System.out.println(products);
		for (Product product : products) {
			System.out.println(product);
		}
		Collections.sort(products);
		System.out.println();
		System.out.println("Sorted by ProductName");
		for (Product product : products) {
			System.out.println(product);
		}
		
	
	
	
	}
}
