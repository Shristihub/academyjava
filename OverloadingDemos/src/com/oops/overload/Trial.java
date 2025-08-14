package com.oops.overload;

public class Trial {

	Trial(){
	 System.out.println("hello");
	}
	Trial(int x){
		this("Priya");
		System.out.println("Value "+x);
	}
	Trial(String s){
		this();
		System.out.println("Welcome "+s);
	}
	public static void main(String[] args) {
		Trial trial = new Trial(10);
	}
	
}


