package com.lang.demos;

public class Conversions {

	public static void main(String[] args) {
		// string to pdt
		double x = Double.parseDouble("100.2");
		System.out.println(x);
		
		//pdt to string
		String val = Double.toString(x);
		System.out.println(val);
		
		//pdt to object
		Long obj = 100L;
		
		//object to pdt
		long num = obj;
		
		//string to obj
		Double numobj = Double.valueOf("900");
		
		//obj to pdt
		String data = numobj.toString();
		
		
		
		
		
		
		
		
		
		
	}
}
