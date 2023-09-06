package com.tns.polymorphism;
public class methodOverloadingDemo {	
	void add() {
		int a = 20,b=30,c;
		c = a+b;
		System.out.println(c);
	}
	void add(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		methodOverloadingDemo obj = new methodOverloadingDemo();
		obj.add();
		obj.add(20,40);
		obj.add(70,8.5);
	}
}