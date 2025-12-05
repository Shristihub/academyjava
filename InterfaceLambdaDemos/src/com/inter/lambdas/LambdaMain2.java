package com.inter.lambdas;

public class LambdaMain2 {

	public static void main(String[] args) {
		System.out.println("Addition");
		ICalculator ref = (a,b)->{
			System.out.println("Adding 2 numbers");
			return a+b;
		};
		double sum = ref.calculate(10, 20);
		System.out.println(sum);
		System.out.println();
		
		System.out.println("Difference");
		ref = (a,b)-> a-b;
		double diff = ref.calculate(20, 12);
		System.out.println(diff);
		
		System.out.println("Product");
		ref=(a,b)->a*b;
		double product = ref.calculate(10,20);
		System.out.println(product);
		
		
		
		
		
		
	}
}
