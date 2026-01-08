package com.util.streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		
		int[] nums = new int[] {10,20,30,40};
		//convert to stream
		int sum =  Arrays.stream(nums)
//				    .filter(num-> num>100)
				    .sum();
		System.out.println(sum);
		
		OptionalDouble  opt = 
				Arrays.stream(nums)
//				.filter(num-> num>100)
				.average();
		System.out.println(opt.getAsDouble());
		
		//range
		IntStream.rangeClosed(10, 20)
		   .filter(num->num%2==0)
		   .forEach(System.out::println);
		
		// min(), max
		OptionalInt optnum = Arrays.stream(nums).min();
		optnum.ifPresent(System.out::println);
		
		sum = Arrays.asList("ram","tom","jo").stream()
					.map(String::length)
					.mapToInt(Integer::intValue)
					.sum();
		System.out.println(sum);
	
	}

}





