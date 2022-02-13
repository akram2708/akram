package com.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		
		
		// element() - Return head element  and not remove - If queue is empty, throws exception
		System.out.println(queue.element());
		
		// Peek() - Return head element and not remove, If queue is empty, returns null
		System.out.println(queue.peek());
		
		// Retrive and remove head element, return null if queue is empty
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		// Retrieve and remove element, and throws Exception if queue is empty
		System.out.println(queue.remove());
		
		

	}

}
