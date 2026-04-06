package com.dates.examples;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate date1 = LocalDate.of(2026, 02, 18);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.parse("2007-09-06");
		System.out.println(date2);
		
		Period period = Period.between(date2, date1);
		System.out.println(period);
		System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
		
		System.out.println(date2.getMonth());
		
		
	}
}











