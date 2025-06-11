package com.shristi.basics;

public class Typecast {

	public static void main(String[] args) {
		 //upcasting
		int x =100;
		long y =x*2;
		float a =10.2f;
		double b = a+y;
		System.out.println(b);
		
		// downcasting
		float num = (float)b*2; 
		long num1 = (long)num+100;
		int num2 = (int)num1;
		System.out.println(num2);
		byte num3= (byte)num2;
		System.out.println(num3); 
		int num4=300;
		byte num5 = (byte)num4;
		System.out.println(num5); //300-256 = 44
		
		byte b1 = 10;
		byte b2 = 30;
		byte b3 = (byte) (b1+b2);
		System.out.println(b3);
		
		int a1 = 100;
		int a2 = 200;
		byte a3 = (byte)( a1+a2);
		System.out.println(a3);
		
		
		
	}
}
