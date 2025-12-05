package com.inter.lambdas;

public class LambdaMain {

	public static void main(String[] args) {
		//lambda expression
		IPrinter ref = ()->{
			System.out.println("printing product details");
		};
		System.out.println("called first");
		//calling
		ref.printData();
		System.out.println();
		//implementation
		ref = ()->System.out.println("Printing student details");
		System.out.println("This will be called first");
		ref.printData();
		
		
		
	}
}
