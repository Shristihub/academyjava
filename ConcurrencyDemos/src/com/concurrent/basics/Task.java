package com.concurrent.basics;


public class Task implements Runnable{
	
	@Override
	public void run() {
		//task to be performed
		String name = Thread.currentThread().getName();
		System.out.println("Hello "+name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
