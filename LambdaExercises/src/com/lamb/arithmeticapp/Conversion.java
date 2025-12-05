package com.lamb.arithmeticapp;

public class Conversion {

	public static void main(String[] args) {
		Processor processor = new Processor();
		ICalculator ref = x -> {
			System.out.println("Square");
			return x * x;
		};
      double squareValue = processor.doTask(20, ref);
      System.out.println(squareValue);
      System.out.println();
      double sqrt = processor.doTask(16, a-> Math.sqrt(a));
      System.out.println(sqrt);
      System.out.println();
      double cube = processor.doTask(4, a->{
    	  return Math.pow(a, 3);
      });
      System.out.println(cube);
      
      System.out.println();
      cube = processor.doTask(8, a->Math.pow(a, 3));
      System.out.println(cube);
	}
}







