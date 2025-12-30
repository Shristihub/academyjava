package com.util.mapex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
//		keys are added as per hashcode value
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Raju");
		map.put(2, "Tom");
		map.put(3, null);
		map.put(1, "Nandhu");
		map.put(null, "Raju");
		map.put(14, "Helen");
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get(1)); //Nandhu
		System.out.println(map.get(11)); // null
		System.out.println(map.containsKey(11)); //false
		System.out.println(map.containsValue("raju")); //false
		
		System.out.println(map.getOrDefault(11, "Priya"));
		
		//first way
		// get the key first and then get the value
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		for(Integer key :keys) {
			String val = map.get(key);
			System.out.println(key+ " "+val);
		}
		
		System.out.println();
		// second way
		// get the key and value - inner interface
		Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
		
		for(Map.Entry<Integer, String> en :entrySet) {
			Integer key = en.getKey();
			String val = en.getValue();
			System.out.println(key +"  "+val);
		}
		
		
	}
}









