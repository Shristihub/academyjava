package com.dates.examples;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateDemo {

	public static void main(String[] args) {
		ZonedDateTime zoneDate = ZonedDateTime.now();
		System.out.println(zoneDate);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		zoneDate = ZonedDateTime.now(zoneId);
		System.out.println(zoneDate);
		
		// get the available zoneIds
		Set<String> zoneIds =  ZoneId.getAvailableZoneIds();
		for (String newZoneId : zoneIds) {
			System.out.println(newZoneId);
			ZoneId id = ZoneId.of(newZoneId);
			zoneDate = ZonedDateTime.now(id);
			System.out.println(newZoneId+" "+zoneDate);
			System.out.println();
		}
		
	}
}







