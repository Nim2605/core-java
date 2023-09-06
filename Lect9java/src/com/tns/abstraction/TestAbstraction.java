package com.tns.abstraction;
abstract class Shape4{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangle ..");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
public class TestAbstraction {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		
		Circle  c = new Circle();
		c.draw();
	}
}