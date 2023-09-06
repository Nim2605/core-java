package com.tns.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAcc_no(1233443443);
		acc.setAmount(22424.56f);
		acc.setEmail("nimishtambat1@gmail.com");
		acc.setName("Nimeesh Tambat");		
		System.out.println(acc.getAcc_no()+ " "+ acc.getAmount()+" "+ acc.getEmail()+ " "+ acc.getName());		
	}
}
