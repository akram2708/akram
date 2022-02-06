package com.simplilearn.staticKeyword;



class E {
	
	
	
	
	
	static int a=0;
	int b;
	
	
	
	E() {
		System.out.println("Constructor called");
		a++;
	}
	
	static {
		
		System.out.println("Instance block is called");
	}
}


public class StaticExample {
	public static void main(String[] args) {
		E e = new E();
		// ClassLoad
		// static block
		
		
	}
}
