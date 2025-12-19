package com.io.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineDemo {

	public static void main(String[] args) {
		// converts bytes into characters
		InputStreamReader in = new InputStreamReader(System.in);
		// reads characters and stores in buffer
		BufferedReader reader = new BufferedReader(in);
		System.out.println("Reading...");
		
		try {
			String line = reader.readLine();
			while(!line.equals("stop")) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}











