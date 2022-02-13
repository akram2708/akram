package com.simplilearn.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<>();
		
		map.put("Alex", "Simplilearn");
		map.put("Naseem", "Simplilearn");
		map.put("Kalyanam", "Simplilearn");
		
		
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k);
		}
		
		TreeMapDemo t = new TreeMapDemo();
		t.test();
		
	}
	
	
	public void test() {
		System.out.println("Testing ");
		test1();
	}
	
	public void test1() {
		System.out.println("Testing ");
		
	}
}