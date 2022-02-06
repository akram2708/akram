package com.simplilearn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Shudhanshu");
		list.add("Rod");
		list.add("Irfan");
		
		
		/*Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for(String data : list) {
			System.out.println(data);
		}
		
		
		
		
		
	}

}
