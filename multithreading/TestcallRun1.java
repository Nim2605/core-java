package com.tns.multithreading;

public class TestcallRun1 extends Thread{
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestcallRun1 t1 = new TestcallRun1();
		t1.run();
	}

}
