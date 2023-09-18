package com.tns.multithreading;

public class TestThreadTwice extends Thread {
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadTwice t1= new TestThreadTwice();
		t1.start();
	}

}
