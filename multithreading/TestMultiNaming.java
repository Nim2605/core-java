package com.tns.multithreading;

public class TestMultiNaming extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiNaming t1 = new TestMultiNaming();
		TestMultiNaming t2 = new TestMultiNaming();
		t1.start();
		t2.start();

	}

}
