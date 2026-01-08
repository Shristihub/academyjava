package com.util.streams;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
//		Optional<String> optstr = Optional.of("Priya");
//		System.out.println(optstr);
//		String val = optstr.get();
//		System.out.println(val);
//		
//		optstr = Optional.ofNullable(null);
//		System.out.println(optstr);
//		val = optstr.get();
//		System.out.println(val);

		Optional<String> optstr = Optional.ofNullable("Priya");
		// check if optional has value
		if (optstr.isPresent()) {
			String val = optstr.get();
			System.out.println(val);
		}

		optstr.ifPresent(System.out::println);
		optstr = Optional.ofNullable(null);
		optstr.ifPresentOrElse(str -> System.out.println(str), () -> System.out.println("no data"));
		System.out.println();

		String sub = optstr.orElse(getMessage());
		System.out.println(sub);
		// best choice
		String sub1 = optstr.orElseGet(() -> getMessage());
		System.out.println(sub1);

//		optstr.orElseThrow(()-> new RuntimeException("no data present"));

		Optional<String> optstr1 = optstr.or(() -> {
			return Optional.of("new set of data");
		});
//		if(optstr1.isEmpty()) {
//			System.out.println("no data available");
//		}
		if (optstr1.isPresent())
			System.out.println(optstr1.get());

	}

	static String getMessage() {
		System.out.println("printing...");
		return "other data";
	}

}
