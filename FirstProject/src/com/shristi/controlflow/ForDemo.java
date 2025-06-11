package com.shristi.controlflow;

public class ForDemo {

	public static void main(String[] args) {
//		Print numbers 1-10
		for(int i=1;i<=10;i=i+2) {
			System.out.println(i);
		}
		System.out.println();
//		Sum of numbers - 1-10
		int sum = 0;
		for(int i=1;i<=10;i++) {
//			sum = sum+i;
			sum+=i;
		}
		System.out.println(sum);
		System.out.println();
		
//		Print even numbers between 1-20
		for(int i=2;i<20;i=i+2){
			System.out.println(i);
		}
		System.out.println();
		for(int i=1;i<20;i++) {
			if(i%2==0) System.out.println(i);
		}
		System.out.println();
//		Print Multiplication Table of 5 for 20 nums
		for(int i=1;i<=20;i++) {
			//1*5=5; 2*5=10;3*5=15
			System.out.println(i+" * 5 = "+(i*5));
			
		}

//       for(; ;) {
//    	   System.out.println("hello");
//       }
	 int i=0;
	  for(i=0;i<10;i++)
		  System.out.println(i);
	  
	  System.out.println("hi "+i);
	
	
	
	
	}
}
