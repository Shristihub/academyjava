package com.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<List<String>> names =Arrays.asList(
							Arrays.asList("a","b"),
							Arrays.asList("c","d"),
							Arrays.asList("e","f"));
		
		names.stream() //Stream<List<String>>
		   .flatMap(list->list.stream()) //Stream<String>
		   .sorted((s1,s2)->s2.compareTo(s1))
		   .map(String::toUpperCase)
		   .forEach(System.out::println);
		
		Integer[][] nums = new Integer[][] {{10,20},{20,20},{40,60}};
		Optional<Integer> opt = Stream.of(nums) //Stream<Integer[]>
							.flatMap(onearr->Arrays.stream(onearr)) //Stream<Integer>
							.filter(num-> num>100)
							.reduce((x,y)->x+y);
		opt.ifPresent(System.out::println);
		
		 Integer sum = Stream.of(nums) //Stream<Integer[]>
				.flatMap(onearr->Arrays.stream(onearr)) //Stream<Integer>
				.filter(num-> num>100)
				.reduce(10,(x,y)->x+y);
		System.out.println(sum);
	}
}






