package com.io.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) {
		//read from the file
		//get an instance od ObjectInputStream to read from fileinputstream
		try(
		FileInputStream is = new FileInputStream("stud.ser");
		ObjectInputStream os = new ObjectInputStream(is);){
			System.out.println("Deserializing");
			//call readObject method of os
			Student student =  (Student)os.readObject();
			System.out.println(student);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
