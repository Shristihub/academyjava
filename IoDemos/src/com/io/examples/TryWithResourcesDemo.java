package com.io.examples;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		System.out.println("Reading...");

		// add the resources inside the parenthesis
		try (FileWriter writer = new FileWriter("demo.txt", true);) {
			String line = reader.readLine();
			while (!line.equals("stop")) {
				writer.write(line); // writing in a file
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
