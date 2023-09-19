package com.tns.variable;

class Demo{
	static int value =100;
	
	static void show() {
		System.out.println("THis static method ");
	}
}
public class MultiStatic {

	public static void main(String[] args) {
		System.out.println(Demo.value);
		Demo.show();
	}

}
