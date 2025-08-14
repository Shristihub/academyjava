package com.oops.overload;

public class VarArgsDemo {
	
	static void calcSum(String name,int...marks) {
		System.out.println("Name "+name);
		System.out.println(marks.length);
		int sum = 0;
		for (int mark : marks) {
			sum+=mark;
		}
		System.out.println("Sum "+sum);
	}
	
	static void calcSum(String name) {
		System.out.println("Welcome "+name);
	}

	public static void main(String[] args) {
		calcSum("Jacob", 90,80);
		calcSum("Tina",90,100,60,80,85);
		calcSum("Priya");
	}
}



