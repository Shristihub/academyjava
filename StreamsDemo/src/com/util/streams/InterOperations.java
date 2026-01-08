package com.util.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterOperations {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("kiwi","apple","pineapple","orange","strawberry","grapes","blueberry","grapes");
		
		//filter,sorted, distinct
		fruits.stream()
		      .filter(str->str.contains("a"))
		      .sorted()
		      .distinct()
		      .forEach(System.out::println);
		System.out.println();
		// map, limit, skip
		fruits.stream()
//		      .map(str->str.toUpperCase())
			  .map(String::toUpperCase)
		      .sorted()
		      .limit(5)
		      .skip(1)
		      .forEach(System.out::println);
		
		System.out.println();
		
		Stream<Integer> instream = Stream.concat(Stream.of(1,2,3,4), Stream.of(10,20,30));
		instream.filter(num->num>3)
		        .map(num->num*num)
		        .map(num->num.toString())
		        .forEach(num->System.out.println(num+num));
		
		System.out.println();
		// map, 
		fruits.stream()
			  .map(str->str.length())
			  .sorted()
			  .distinct()
		      .forEach(System.out::println);
		
		//iterator
		Iterator<String> it = fruits.stream().sorted().iterator();
		while(it.hasNext())
			System.out.println(it.next().toUpperCase());
		
		
		//collect
		List<String> newfruits = fruits.stream().sorted().collect(Collectors.toList());
		newfruits.forEach(System.out::println);
		
		
		int sum = fruits.stream()
			.map(String::length)
			.reduce((x,y)->x+y)
			.get();
		System.out.println(sum);
		
	}
}










