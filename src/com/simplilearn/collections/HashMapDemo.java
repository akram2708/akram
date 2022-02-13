package com.simplilearn.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	
	public static void main(String[] args) {
		HashMap<String, String> m1 = new HashMap<>();
		
		
		m1.put("Dhruvik", "Parikh");
		m1.put("Rod", "Simplilearn");
		
		m1.put("id", "abc");
		
		m1.get("id");
	
		
	String valueOfDrhuvik = 	m1.get("Dhruvik");
		String valueOfRod = m1.get("Rod");
		
		
		
		System.out.println(m1.get("Dhruvik"));
		System.out.println(m1.get("Rod"));
		
		Set<String> data = m1.keySet();
		Collection<String> values = m1.values();
		
		
	}
	
}
