package com.tns.keyword;

final class A {
	void run() {
		System.out.println("This is the base class");
	}
}

class B extends A{
	void run() {
		System.out.println("this is the derived class");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.run();
	}

}
