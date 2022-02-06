package com.simplilearn.memory;


class A {
	
	
	void methodA() {
		System.out.println("A is called");
	}
}

class B extends A{
	
	
	void methodB() {
		System.out.println("B is called");
		methodA();
	}
}

class C extends B{
	
	void methodC() {
		System.out.println("C is called");
		methodB();
	}
}


public class MemoryExample {

	public static void main(String[] args) {
		
		C c = new C();
		c.methodC();
	}

}
