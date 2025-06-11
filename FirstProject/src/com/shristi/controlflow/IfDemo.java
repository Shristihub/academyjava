package com.shristi.controlflow;

public class IfDemo {

	public static void main(String[] args) {
//		Check Even or Odd - whether a number is even or odd using if-else.
		int num = 56;
		if(num%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd NUmber");
		}
		
//		Find the Largest of three Numbers
		int a =100; int b=120; int c=90;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
		
//		Check Voting Eligibility
//		Input age, and print whether a person is eligible to vote (18+).
		
		int age =23;
		if(age>18)
			System.out.println("eligible to vote");
		else
			System.out.println("not eligible");
		
//		check book availability
	   boolean isAvailable = false;
	   if(isAvailable) {
		   System.out.println("Book is available");
	   }else
		   System.out.println("Book not available");
	   
	 // check seat availability
	  if(!isAvailable) {
		  System.out.println("No vacant seats");
	  }else
		  System.out.println("seats are available");
		
		
		
		
	}
}



