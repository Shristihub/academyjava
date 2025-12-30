package com.util.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question1 {

	public static void main(String[] args) {
		Map<String,List<String>> stateMap = new TreeMap<>();
		stateMap.put("Tamilnadu", Arrays.asList("Chennai","Trichy","Madurai"));
		stateMap.put("Kerala", Arrays.asList("Cochin","Allepey","Trivandrum"));
		stateMap.put("Karnataka", Arrays.asList("Bengaluru","Mangalore","Mysore"));
	
	Set<Map.Entry<String,List<String>>> entryset = stateMap.entrySet();
	for(Map.Entry<String,List<String>> en:entryset) {
		String state = en.getKey();
		List<String> cities =  en.getValue();
		System.out.print("State:  "+state);
		System.out.println(" Cities:  "+cities);
	}
	
	
	
	}
}










