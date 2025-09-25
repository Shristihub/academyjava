package com.abs.ex1;

public class Client {

	public static void main(String[] args) {
		TeamLeader leader = new Group1();
		leader.doProject();
		leader.showTools(); // calling from super class
		
		leader =  new Group2();
		leader.doProject();
		leader.showTools(); // calling from Group2
	}

}
