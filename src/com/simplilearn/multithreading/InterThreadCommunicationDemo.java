package com.simplilearn.multithreading;

class Customer {
	volatile int balance = 10000;

	synchronized void withdraw(int withdraw) throws InterruptedException {
		if(this.balance < withdraw) {
			System.out.println("Less balance, Waiting for other thread to deposit..");
			this.wait();
		}
		this.balance -= withdraw;
		System.out.println("Withdraw Completed...");
	}

	synchronized void deposit(int depositAmount) {
		System.out.println("Going to deposit amount");
		this.balance += depositAmount;
		
		System.out.println("Deposit completed");
		this.notify();
	}
}

class WithdrawRunnable implements Runnable {
	Customer c;
	
	public WithdrawRunnable(Customer c) {
		this.c = c;
	}
	@Override
	public void run() {
		try {
			c.withdraw(15000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class DepositRunnable implements Runnable {
	Customer c;
	
	public DepositRunnable(Customer c) {
		this.c = c;
	}
	@Override
	public void run() {
		c.deposit(10000);
	}
}


public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		Customer c = new Customer();
		
		Thread t1 = new Thread(new WithdrawRunnable(c));
		t1.start();
		
		Thread.sleep(10000);
		
		Thread t2 = new Thread(new DepositRunnable(c));
		t2.start();
		
	}
}
