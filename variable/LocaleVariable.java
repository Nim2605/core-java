package com.tns.variable;

public class LocaleVariable {
	void printAverage(int a,int b) {
		int avg=(a+b)/2;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocaleVariable  obj = new LocaleVariable();
		obj.printAverage(50, 5);
	}

}
