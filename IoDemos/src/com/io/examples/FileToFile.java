package com.io.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileToFile {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("demo.txt"); 
			FileWriter writer = new FileWriter("demo1.txt");) {
//			use the reader to read  from demo.txt
			int c = reader.read();
			while (c != -1) {
				// use the writer to write into demo1.txt
				writer.write(c);
				c = reader.read();
			}
			System.out.println("Task completed");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
