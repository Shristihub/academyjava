package com.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {

	public static void main(String[] args) {
		List<String> fruits = 
				Arrays.asList("kiwi","apple","pineapple","orange","strawberry","grapes","blueberry","grapes");
		
		//return value as a list, one single value or printing the data
		//collect, toList,findFirst, forEach, iterator
		
		List<String> newfruits  = fruits.stream()
			.filter(str-> str.contains("e"))
			.toList();
		newfruits.forEach(System.out::println);
		System.out.println();
		
		//findFirst
		Optional<String> optfirst = fruits.stream()
		    .filter(str->str.contains("z"))
		    .findFirst();
		//check if optional has value
		if(optfirst.isPresent()) {
		    String first = optfirst.get();
		   System.out.println(first);
		}
		
		//orelse , orelseget
		String nfruit = fruits.stream()
					.filter(str->str.contains("q"))
					.findFirst()
//					.orElse("no fruit");
					.orElseGet(()->"fruit not available");
		System.out.println(nfruit);
		
		 fruits.stream()
			.filter(str->str.contains("z"))
			.findFirst()
			.orElseThrow(()->new RuntimeException("no fruit available"));
			
			
			
			
		
		
	}
}
