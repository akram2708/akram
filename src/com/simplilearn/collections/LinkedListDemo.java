package com.simplilearn.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Gopal");
		list.add("Akansha");
		list.add("Rod");

		for (String data : list) {
			System.out.println(data);
		}
	}

}
