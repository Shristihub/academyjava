package com.threads.basics;

public class SleepDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
