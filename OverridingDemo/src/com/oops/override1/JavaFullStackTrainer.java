package com.oops.override1;

public class JavaFullStackTrainer extends Institute {

	@Override
	String[] showTopics() {
		String[] topics = super.showTopics();
		for (String topic : topics) {
			System.out.println(topic);
		}
		return new String[] {"Java","Spring","Microservices","React"};
	}

	
}
