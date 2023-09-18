package com.tns.multithreading;

public class TestMultinaming1 extends Thread{
	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultinaming1 t1 = new TestMultinaming1();
		TestMultinaming1 t2 = new TestMultinaming1();
		
		System.out.println("Name of t1:"+ t1.getName());
		System.out.println("Name pf t2:"+ t2.getName());
		
		t1.start();
		t2.start();
		
		t1.setName("Nimeesh");
		System.out.println("After changing name of t1:"+t1.getName());
		
		t2.setName("Sakshi");
		System.out.println("After changing name of t2:"+t2.getName());
		
	}

}
