package com.shristi.exercises;

import java.util.Scanner;

public class ControlScanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
//		Find the Largest of three Numbers
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greater");
		}else if(num2>num3) {
			System.out.println("num2 is greater");
		}else {
			System.out.println("c is greater");
		}
		
//		check seasons - provide solutions based on that
		System.out.println("Enter season - summer/rainy/winter/spring");
		String season = sc.next();
		switch(season.toUpperCase()) {
		case "SUMMER":
			System.out.println("Eat icecreams and juices to make you cool");
			break;
		case "RAINY":
			System.out.println("Have hot tea with samosas");
			System.out.println("Enjoy rain");
			break;
		case "WINTER":
			System.out.println("Have hot soup and read a book");
			System.out.println("Stay home");
			break;
		case "SPRING":
			System.out.println("enjoy the breeze and freshness in air");
			System.out.println("greenery everywhere");
			break;
		default:
			System.out.println("wrong choice");
		
		}	
		sc.close();
		
		
		
	}
}
