package com.shristi.arrays;

public class OneDim {

	public static void main(String[] args) {
		// declare, initialize
		int[] nums = new int[4];
		System.out.println(nums.length);
		int x = nums[0];
		System.out.println(nums[0]);
		// populate
		nums[0] = 100;
		nums[1] = 150;
		nums[2] = 200;
		nums[3] = 250;
//		nums[4]=300; // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Printing");
		// iterate and print
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println();

		int v = 100;
		// populate using for loop
		for (int i = 0; i < nums.length; i++) {
//			nums[i] = v * i + 1;
			nums[i] = (int)(Math.random()*10);
			
		}
		System.out.println("Printing");
		// iterate and print
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
}
