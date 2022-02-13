package com.simplilearn.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> data = new LinkedHashSet<>();
		
		data.add("Dhruvik");
		data.add("Dhruvik");
		data.add("Arun");
		data.add("Bijal");
		data.add("Alex");
		
		System.out.println(data.size());
		
		for(String d : data) {
			System.out.println(d);
		}
	}

}
