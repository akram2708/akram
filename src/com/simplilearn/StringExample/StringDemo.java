package com.simplilearn.StringExample;

class Employee {
	public String name;
	int a;
	String lastName = new String("Parikh");

	static void test() {

	}

}

// Employee e = new Employee();

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("Mehtods of String :::");

		String s1 = "Hello";
		System.out.println(s1.length());

		// Substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));

		// Comparisions
		String s2 = "Hello";
		String s3 = "Heldo";

		System.out.println(s2.compareTo(s3));
		/*
		 * Compare two string lexicographically return 0 - If both strings are equals
		 * return <0 - If s2 less than s3 return >0 - If s2 greater than s3
		 */

		String s4 = "Hello";
		String s5 = "Hello";
		System.out.println(s4.equals(s5));

		// IsEmpty
		String s6 = "";
		System.out.println(s6.isEmpty());

		// toLowerCase
		String s7 = "Hello";
		System.out.println(s7.toLowerCase());

		// Replace
		String s8 = "Heldo";
		String replacedString = s8.replace('d', 'l');
		System.out.println(replacedString);

		// String buffer
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" World");

		String finalString = sb.toString();
		System.out.println(finalString);

		String s9 = "Hello";
		String s10 = "World";
		System.out.println(s9 + s10);
		System.out.println(s9.concat(s10));

	}
}
