package com.io.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		//create a student object
		Student student = new Student("Priya",1,"ECE");
		//create an object of FileOutputSTream to store the student object
		//create an object of ObjectOutputStream to write the date in fs
		try(FileOutputStream fs = new FileOutputStream("stud.ser");
		    ObjectOutputStream os = new ObjectOutputStream(fs);	){
			System.out.println("serializing");
			//call the writemethod towrite the object to os
			os.writeObject(student);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}









