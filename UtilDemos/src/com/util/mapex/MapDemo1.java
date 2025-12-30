package com.util.mapex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		// keys are added in insertion order
//		Map<Integer, String> map = new LinkedHashMap<>();
//		map.put(1, "Raju");
//		map.put(2, "Tom");
//		map.put(3, null);
//		map.put(1, "Nandhu");
//		map.put(null, "Raju");
//		map.put(14, "Helen");
//		System.out.println(map);
//		System.out.println(map.size());
//
//		System.out.println(map.get(1)); // Nandhu
//		System.out.println(map.get(11)); // null
//		
//
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		for (Map.Entry<Integer, String> en : entrySet) {
//			System.out.println(en.getKey() + "  " + en.getValue());
//		}
		
		// keys are sorted and added
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Raju");
		map.put(2, "Tom");
		map.put(3, null);
		map.put(1, "Nandhu");
//		map.put(null, "Raju"); // null pointer exception
		map.put(14, "Helen");
		System.out.println(map);
		System.out.println(map.size());

		System.out.println(map.get(1)); // Nandhu
		System.out.println(map.get(11)); // null
		

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> en : entrySet) {
//			map.put(50, "Lucky");  //ConcurrentModificationException
			System.out.println(en.getKey() + "  " + en.getValue());
		}
		
		
		
	}

}
