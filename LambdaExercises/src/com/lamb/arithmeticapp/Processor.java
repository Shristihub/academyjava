package com.lamb.arithmeticapp;

public class Processor {

	 double doTask(int x, ICalculator ref){
		 System.out.println("Task started");
		 double result =  ref.calculate(x);
		 System.out.println("Result "+result);
		 System.out.println("Task completed");
		 return result;
	 }
}
