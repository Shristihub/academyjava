package com.threads.runn;

class ChildRunner implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
public class DaemonDemo {

	public static void main(String[] args) {
		
		Thread t = new Thread(new ChildRunner(),"mythread-1");
		t.setDaemon(true);
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("Work completed in main");
	
	}
}
















