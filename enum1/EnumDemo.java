package com.tns.enum1;

enum leveled{
	HIGH,
	MEDIUM,
	LOW
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(leveled myVar:leveled.values()) {
			System.out.println(myVar);
		}

	}

}
