package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {

	private static final long serialVersionUID = 2L;
	
	public int a;
	public String b;
	
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}


public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		// Serialization
		Demo d = new Demo(2, "Dhruvik");
		
		FileOutputStream fos = new FileOutputStream("file.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		
		oos.close();
		fos.close();
		
		System.out.println("Object has been serialized");
	
	
	}
	

}
