package com.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("kiwi","apple","pineapple","orange","berry");
//		Stream<String> stream = fruits.stream(); //convert list to stream
//		System.out.println(stream);
		
		//convert list to stream-- perform intermediate operations--- end with terminal operation
//		fruits.stream().forEach(str->System.out.println(str));
		fruits.stream().forEach(System.out::println);
		
		System.out.println();
		//convert array to stream
		String[] names = new String[] {"Tom","John","Ram","Raju","Jo","Jack","Rakesh"};
		Stream.of(names).forEach(System.out::println);
		System.out.println();
		Arrays.stream(names,1,5).forEach(System.out::println);
		
		Integer[] numsobj = new Integer[] {1,2,3,4,5};
		Stream.of(numsobj).forEach(num->System.out.println(num*num));
		
		//convert primitive array onto a stream
		int[] nums = {1,2,3,4,5};
		Arrays.stream(nums).forEach(System.out::println);
		
		
		// generate an infinite stream
		Stream.generate(()-> "hello").limit(5).forEach(System.out::println);
		
		
		
		
	}
}













