package com.shristi.arrays;

public class TwoDim {

	public static void main(String[] args) {
		int[][]nums = new int[3][2];
		System.out.println(nums.length);
		//populate
		nums[0][0]=150;
		nums[0][1]=120;
		nums[1][0]=180;
		nums[1][1]=170;
		nums[2][0]=110;
		nums[2][1]=130;
//		nums[2][2] =100; // java.lang.ArrayIndexOutOfBoundsException
		
		// iterating thru the rows
		for(int i=0;i<nums.length;i++) {
			//iterate thru the columns
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Using for each");
		for(int[]one:nums) {
			for(int val:one)
				System.out.print(val+" ");
			System.out.println();
		}
		
		
		
		
	}

}
