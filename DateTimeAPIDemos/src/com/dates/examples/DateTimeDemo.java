package com.dates.examples;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDateTime newDateTime = LocalDateTime.of(2026, Month.FEBRUARY, 10, 06, 10);
		System.out.println(newDateTime);
		
		System.out.println(newDateTime.getDayOfYear());
		
		LocalDateTime dateTime =  newDateTime.withDayOfYear(100).withYear(2026);
		System.out.println(dateTime);
		
		
		System.out.println(dateTime.getMonth());
		
	}
}




