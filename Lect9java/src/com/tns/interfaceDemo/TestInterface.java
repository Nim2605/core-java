package com.tns.interfaceDemo;
class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.6778f;
	}
}
class BOI implements Bank
{
	public float rateOfInterest()
	{
		return 6.43f;
	}
}
public class TestInterface 
{
	public static void main(String[] args) 
	{
		SBI s = new SBI();
		System.out.println("RATE OF INTERESET OF SBI "+s.rateOfInterest());
		
		BOI b = new BOI();
		System.out.println("RATE OF INTERESET OF BOI"+b.rateOfInterest());
	}
}
