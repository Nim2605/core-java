package com.tns.interfaceDemo;
interface Printable{ //Super 1
	void print();
}
interface Showable{  //Super 2
	void show();
}
class Demo implements Printable,Showable{
	public void print() {
		System.out.println("Printable interface");
	}
	public void show() {
		System.out.println(" Showable interface");
	}	
}
public class TestInterDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		d.show();
	}
}