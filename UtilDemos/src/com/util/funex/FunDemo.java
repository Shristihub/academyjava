package com.util.funex;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {
		Consumer<String> con  = str ->System.out.println("Welcome "+str.toUpperCase());
		con.accept("Sri");
		Consumer<Double> con1 = num ->System.out.println(Math.sqrt(num));
		con1.accept(16.0);
		
		Supplier<String> sup = ()-> "Have a great day";
		System.out.println(sup.get());
		
		Predicate<Integer> pred = num->num>5;
		System.out.println(pred.test(10));
		
		Function<String, String> fun = str->str.toUpperCase();
		System.out.println(fun.apply("hello"));
		
		
		Function<String, Integer> fun1 = str->str.indexOf("a",4);
		System.out.println(fun1.apply("Have a great day"));
	}
}














