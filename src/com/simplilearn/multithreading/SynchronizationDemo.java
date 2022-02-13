package com.simplilearn.multithreading;

class MyThread1 implements Runnable {
	Table t;

	public MyThread1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 implements Runnable {
	Table t;

	public MyThread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(6);
	}
}

class Table {

	public synchronized void printTable(int n) {
		
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
	}

}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		Table t = new Table();

		Thread t1 = new Thread(new MyThread1(t));

		Thread t2 = new Thread(new MyThread2(t));

		t1.start();
		
		t2.start();

	}

}
