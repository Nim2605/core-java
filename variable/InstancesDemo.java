package com.tns.variable;

public class InstancesDemo {
	int a =50;
	int b=5,c;
	void divide() {
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstancesDemo obj = new InstancesDemo();
		obj.divide();
	}

}
