package com.simplilearn.accessSpecifiers;


class B {
	
	void msg() {
		
	}
}


public class DefaultAccessSpecifierDemo {
	
	public static void main(String[] args) {
		B b = new B();
		b.msg();
	}

}
