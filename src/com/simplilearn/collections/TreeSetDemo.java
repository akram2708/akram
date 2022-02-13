package com.simplilearn.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> data = new TreeSet<>();
		data.add("Ravi");
		data.add("Alex");
		data.add("Scott");
		data.add("Bipin");
		data.add("Alex");
		
		System.out.println(data.size());
		
		for(String d : data) {
			System.out.println(d);
		}

	}

}
