package com.shristi.controlflow;

public class WhileDemo {

	public static void main(String[] args) {
//		Print numbers 1-10
		int num=1;
		while(num<11) {
			System.out.println(num);
			num++;
		}
		System.out.println();		
//		Sum of 10 numbers 1-10
		int sum = 0; int i=1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("Sum "+sum);
		
		
//		Print even numbers between 1-20
	    num=1;
	    while(num<21) {
	    	if(num%2==0) {
	    		System.out.print(num+" ");
	    	}
	    	num++;
	    }

//		Print Multiplication Table of 5
	    num =1;
	    while(num<21) {
	    	//1*5=5; 2*5=10;3*5=15
			System.out.println(num+" * 5 = "+(num*5));
			num++;
	    }
	    
	    
	    
	    

	}

}
