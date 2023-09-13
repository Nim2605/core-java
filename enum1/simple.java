package com.tns.enum1;
enum levele{
	LOW,
	MEDIUM,
	HIGH
}
public class simple {
	public static void main(String[] args) {
		levele obj = levele.HIGH;
		switch(obj) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
	}
}
