package com.simplilearn.accessSpecifiers;

abstract class Test {
	public abstract void display();
}

public class InnerClassExample {
	private String msg = "Welcome to Simplilearn";

	// Member Inner class
	class Inner {

		void hello() {
			System.out.println(msg);
		}
	}

	// Local Inner class

	void display() {

		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}

		Inner obj = new Inner();
		obj.msg();
	}

	// Static inner class - Outside of any method inside class define with static
	// keyword
	static class Inner1 {
		void msg() {
			System.out.println("Welcome to simplilearn");
		}
	}

	public static void main(String[] args) {

		InnerClassExample obj = new InnerClassExample();

		// Member inner class running
		Inner innerObj = obj.new Inner();
		innerObj.hello();

		// Local Inner class Running
		obj.display();

		// Anonnymous inner class running
		Test testObj = new Test() {

			public void display() {
				System.out.println("Welcome to simplilearn");
			}
		};

		testObj.display();

		// Static inner class running
		InnerClassExample.Inner1 obj2 = new InnerClassExample.Inner1();
		obj2.msg();
	}
}
