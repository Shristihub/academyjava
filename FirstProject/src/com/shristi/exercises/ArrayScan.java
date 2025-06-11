package com.shristi.exercises;

import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {
		int[] marks =new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		//populating
		for (int i = 0; i < marks.length; i++) {
//			get int input from scanner
//			int m = sc.nextInt();
//			assign to marks[i]
//			marks[i]=m;
			
			//get marks using Scanner
			marks[i]=sc.nextInt();
		}
		
		// iterate this array
		for (int mark : marks) {
			System.out.println("Mark: "+mark);
		}
		// get the sq of each element and store in anew array
		
		//create a new array
		double[] markssquare = new double[marks.length];
	
		//iterate the marks array
	   for (int i = 0; i < marks.length; i++) {
		// get the square of each element
//		int marksq = marks[i]*marks[i];
		   
		double marksq = Math.pow(marks[i], 2);
		//set the value in the index of markssquare array
		markssquare[i]=marksq;
	}
		// iterate thru markssquare array
	     for (double marksq : markssquare) {
			System.out.println("square: "+marksq);
		}
		
	}
}









