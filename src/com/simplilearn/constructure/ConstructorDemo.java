package com.simplilearn.constructure;


class Employee1 {
	private String name;
	private String emailId;

	public Employee1(String name, String emailId) {
		this.name = name;
		this.emailId = emailId;

	}

	public String display() {
		return name + " " + emailId;
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1("dhruvik", "dhruvik@simplilearn.com");

		System.out.println(e1.display());
	}

}
