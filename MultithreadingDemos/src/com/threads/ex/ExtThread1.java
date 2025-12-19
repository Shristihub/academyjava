package com.threads.ex;

class MyChild extends Thread {

	public MyChild(String name, int priority) {
		super(name);
		this.setPriority(priority);
		this.start();
	}

	// this is the cpu where the task is available
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println("...."+name + " .... " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+" "+"completed the task");
	}

}

public class ExtThread1 {

	public static void main(String[] args) {
		MyChild child1 = new MyChild("child-1", 6);
		MyChild child2 = new MyChild("child-2", 3);
		MyChild child3 = new MyChild("child-3", 9);

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			
			System.out.println(name + " .... " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			child1.join();
			child2.join();
			child3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+" "+"completed the task");

	}
}
