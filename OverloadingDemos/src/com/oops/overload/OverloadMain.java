package com.oops.overload;

public class OverloadMain {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10);
		shape.area(10.5);
//		shape.area((int)10.5);
		int rect =shape.area(1, 2);
//		int rect =(int) shape.area(1, 2);
		System.out.println("Rect "+rect);
		System.out.println("Tri "+shape.area(5, 10.5f));
//		System.out.println("Tri "+shape.area(5, (int)10.5f));
		
	}
}
