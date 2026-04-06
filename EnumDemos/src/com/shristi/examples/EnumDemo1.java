package com.shristi.examples;

public class EnumDemo1 {

	public static void main(String[] args) {
		// retrieve the value from enum
		WeekDays weekday = WeekDays.SUNDAY;
		System.out.println(weekday);
		String day = WeekDays.MONDAY.name();
		System.out.println(day.toLowerCase());
		int position = WeekDays.FRIDAY.ordinal();
		System.out.println(position);

		switch (weekday) {
		case MONDAY:
			System.out.println("Starting to work");
			break;
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			System.out.println("Happy working");
			break;
		case FRIDAY:
			System.out.println("Getting ready for weekend");
			break;
//		case SATURDAY:
//		case SUNDAY:
//			System.out.println("Happy Weekend");
//			break;
		default:
			System.out.println("other choice");

		}
	}
}
