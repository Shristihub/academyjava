package com.dates.examples;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime mytime = LocalTime.of(06, 10, 20);
		System.out.println(mytime);
		
		LocalTime strtime = LocalTime.parse("18:06:10");
		System.out.println(strtime);
		
		Duration duration = Duration.between(mytime, strtime);
		System.out.println(duration);
		System.out.println(duration.toHours());
		System.out.println(duration.toMinutes());
		System.out.println(duration.toSeconds());
		
		System.out.println(currentTime.isAfter(mytime)); //true
		System.out.println(currentTime.isAfter(strtime)); //false
		
		
		
		
		
		
		
		
		
	}
}
