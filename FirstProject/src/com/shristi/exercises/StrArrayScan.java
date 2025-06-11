package com.shristi.exercises;

import java.util.Scanner;

public class StrArrayScan {

	public static void main(String[] args) {

		String[] fruits = new String[] { "apple", "orange", "pineapple", "woodapple", "strawberry", "custardapple",
				"blueberry" };
		// check if the array has any element with apple in it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice");
		String choice = sc.next(); // apples
		// iterate thru the array
		for (int i = 0; i < fruits.length; i++) {
			String fruit = fruits[i];
			// check if fruit contains apple
			if (fruit.contains(choice)) {
				System.out.println(fruit);

			}
			sc.close();
		}

	}
}
