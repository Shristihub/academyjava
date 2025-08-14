package com.shristi.exercises;

public class Calculator {
	
	int sum(int x, int y){
		return x+y;
	}
	double square(int x){
		return Math.pow(x, 2);
	}
	float difference(float x, float y) {
		return x-y;
	}

	void product(double x, double y) {
		System.out.println("Product "+(x*y));
	}

}
