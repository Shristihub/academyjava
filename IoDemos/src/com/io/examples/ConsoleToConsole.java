package com.io.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToConsole {
	public static void main(String[] args) {
		// converts bytes into characters
		InputStreamReader in = new InputStreamReader(System.in);
		// reads characters and stores in buffer
		BufferedReader reader = new BufferedReader(in);
		System.out.println("Reading...");
		try {
			//reads character by character
			char c = (char)reader.read();
			// check for a condition to terminate reading
			while(c!='q') {
				System.out.print(c);
				c= (char)reader.read();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
