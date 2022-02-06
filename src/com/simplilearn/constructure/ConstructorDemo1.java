package com.simplilearn.constructure;

class Human  {

	
}

class Employee extends Human {
	String firstName;
	String lastName;

	public Employee() {
		System.out.println("Employee object created ----");
	}
	
	public void display() {
		String s = "Test";
				
	}
}

class Developer extends Employee {
	
	public Developer() {
		System.out.println("Developer Constructor called");
	}
	
}

public class ConstructorDemo1 {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		Human h = new Human();
	}
	
	

}
