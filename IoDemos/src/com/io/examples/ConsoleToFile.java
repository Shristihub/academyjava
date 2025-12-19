package com.io.examples;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		System.out.println("Reading...");

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("demo.txt",true);
			// read from the console
			String line = reader.readLine();
			while (!line.equals("stop")) {
				fileWriter.write(line); // writing in a file
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close(); // close the filewriter object
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
