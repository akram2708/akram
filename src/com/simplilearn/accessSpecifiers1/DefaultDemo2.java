package com.simplilearn.accessSpecifiers1;


import com.simplilearn.accessSpecifiers.C;

class D extends C {
	
	void message() {
		// Protected property from parent class inherited as Private property in child class
		msg();
	}
	
	
}

public class DefaultDemo2  {
	
	

	public static void main(String[] args) {

		D d = new D();
		d.message();
		
		
		
		
		C c = new C();
		
		
		
	}

}
