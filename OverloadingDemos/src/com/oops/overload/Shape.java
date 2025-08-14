package com.oops.overload;

public class Shape {

	void area(int side) {
		System.out.println("Sq "+(side*side));
	}
	void area(double radius) {
		System.out.println("Circle "+(Math.PI*radius*radius));
	}
	int area(int length, int breadth) {
		return length*breadth;
	}
	double area(int base, float height) {
		return 0.5*base*height;
	}
}
