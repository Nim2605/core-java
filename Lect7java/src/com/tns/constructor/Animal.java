package com.tns.constructor;

class Dog {
	void eat() {
		System.out.println("Eating");
	}
}
public class Animal extends Dog{
	void bark() {
		System.out.println("Barking");
	}
	public static void main(String[] args) {
	Animal d = new Animal(); //if null is given it will give output as false
	System.out.println(d instanceof Animal );	
}
}