package com.oops.inher1;

public class CloudComputing extends Courses {

	void toolsUsed(String... tools) {
		System.out.println("Tools Learnt");
		for (String tool : tools) {
			System.out.println(tool);
		}
	}
}
