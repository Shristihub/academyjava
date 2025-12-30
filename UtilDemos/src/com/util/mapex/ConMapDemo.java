package com.util.mapex;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConMapDemo {

	public static void main(String[] args) {
		// used for multithreading applications
		// keys are added in insertion order
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Raju");
		map.put(2, "Tom");
//		map.put(3, null);  // no null value allowed
		map.put(1, "Nandhu");
//		map.put(null, "Raju"); // no null key allowed
		map.put(14, "Helen");
		System.out.println(map);
		System.out.println(map.size());

		System.out.println(map.get(1)); // Nandhu
		System.out.println(map.get(11)); // null
		

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> en : entrySet) {
			map.put(50, "Lucky"); //allows concurrent access
			System.out.println(en.getKey() + "  " + en.getValue());
		}
		System.out.println();
		System.out.println(map);
	}
}









