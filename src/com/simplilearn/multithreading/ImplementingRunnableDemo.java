package com.simplilearn.multithreading;


class Multi implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Running Thread");
	}
}


class Multi1 extends Thread {
	
	public void run() {
		System.out.println("Running Thread");
	}
	
	
}

public class ImplementingRunnableDemo {

	public static void main(String[] args) {
		
		Multi multi = new Multi();
		Thread t1  = new Thread(multi);
		t1.start();
		
		
		/*Multi1 multi1 = new Multi1();
		multi1.start();*/
		
	}

}
