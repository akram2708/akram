package com.simplilearn.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> data = new HashSet<>();
		
		data.add("Dhruvik");
		data.add("Dhruvik");
		data.add("Rod");
		data.add("Raj");
		data.add("Simplilearn");
		data.add("Simplilearn");
		data.add(null);
		data.add(null);
		data.add("");
		
		System.out.println(data.size());
		
		for(String d : data) {
			System.out.println(d);
		}
		
	}

}
