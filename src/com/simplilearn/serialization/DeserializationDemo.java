package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		// Deserialization
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Demo d1 = (Demo) ois.readObject();
		
		ois.close();
		fis.close();

		System.out.println("Object has been deserizlized");
		System.out.println("a =" + d1.a);
		System.out.println("b = " + d1.b);
	}

}
