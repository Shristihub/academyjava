package com.shristi.controlflow;

public class SwitchDemo {

	public static void main(String[] args) {
	
//		Calculator
//		Input two numbers and an operator (+, -, *, /) → perform the operation
		
		int num1=10;int num2=20;
		String operator = "*";
		switch(operator) {
		case "+":
			System.out.println("Sum "+(num1+num2));
			break;
		case "-":
			System.out.println("Diff "+(num1- num2));
			break;
		case "*":
			System.out.println("Product "+(num1*num2));
			break;
		case "/":
			System.out.println("Div "+(num1/num2));
			break;
		default:
			System.out.println("not possible");
		}
		
//		check days - workday/weekoff as output
		String dayOfWeek = "saturday";
		
		switch(dayOfWeek.toUpperCase()) {
		case "MONDAY":
			System.out.println("First day of week");
			System.out.println("Work started");
			break;
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			System.out.println("busy with work");
			System.out.println("no rest time");
			break;
		case "FRIDAY":
			System.out.println("Weekend approaching");
			break;
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("Have fun. Enjoy weekend");
			break;
		default:
			System.out.println("wrong choice");
		
		}
		
//		check seasons - provide solutions based on that
		String season = "SUMMER";
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
		
		
		
		
		
		
	}
}
