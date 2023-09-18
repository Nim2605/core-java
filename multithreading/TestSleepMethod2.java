package com.tns.multithreading;

public class TestSleepMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int j=0;j<5;j++) {
				Thread.sleep(2000);
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
