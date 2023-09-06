package com.tns.polymorphism;
class Shape{
	void draw() {
		System.out.println("Shape can't define ");
	}
}
class square extends Shape{
	void draw() {
		System.out.println("Sqaure shape");
	}
}
public class methodOverRidedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		s.draw();
	}
}
