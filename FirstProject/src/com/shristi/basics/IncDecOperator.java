package com.shristi.basics;

public class IncDecOperator {

	public static void main(String[] args) {
		int x =10;
		x=x+1;
		x+=100;
		System.out.println(x);
		
		int num1 = 100;
		int num2 = 2;
		int num3 = num1++ +num2++; //post
		System.out.println(num3+" "+num2+" "+num1);
		num3 = ++num1+ ++num2; //pre
		System.out.println(num3+" "+num2+" "+num1);
		
		
		int a=10;
		int b =--a*2; //18  9
		System.out.println(b);
		int c = --a+--b; //25  8  17
		System.out.println(c+" "+a+" "+b);
		int d = a-- +b-- + --a + --c; // 8+17+6+24  55
		System.out.println(a); //6
		System.out.println(b);//16
		System.out.println(c); //24
		System.out.println(d); //55
		
		
		
		
		
		
		
		
		
		
	}
}
