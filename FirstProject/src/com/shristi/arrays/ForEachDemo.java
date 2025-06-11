package com.shristi.arrays;

public class ForEachDemo {
	public static void main(String[] args) {
		String[] names = {"Raji","Rakesh","Leena","Kirthi"};
		System.out.println(names.length);
		
		for(String name:names)
			System.out.println(name.toUpperCase());
		
	   // get the sum of nums using for each
	  int[] nums = new int[] {80,78,99,80,88};
	  
	  int sum=0;
	  for(int num:nums) {
//		  sum = sum+num;
		  sum+=num;
		  System.out.println(num+" "+sum);
	  }
		System.out.println(sum);
		
		
	}

}
