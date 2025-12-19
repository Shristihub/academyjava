package com.lang.demos;

public class AutoBoxingDemo {
	public static void main(String[] args) {
				
		int x = 10;
		Integer y=x; // autoboxing
		int z = y;  // autounboxing
		
		//old way
		int a = y.intValue();
		
		int a1= 100;
		long b1 =a1; //upcasting
		Long c1 = b1; // autoboxing
		
		Object o =c1; //upcasting of objects
		Long d1 = (Long)o; // downcasting of objects
		System.out.println(d1);
		
//		Integer a2 = (Integer)o; //classcastException
		
		long b2 = (Long)o; //downacasting and autounboxing
		System.out.println(b2);
	}

}







