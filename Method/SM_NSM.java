package com.Method;

public class SM_NSM {
	public static void SM1()
	{
		System.out.println("SM1 excuted");
	}
	void NSM2()
	{
		System.out.println("SM2 excuted");
	}
	public static void main(String []args)
	{
		System.out.println("main start");
		SM1();
		new SM_NSM().NSM2();
		System.out.println("main ends");
	}
}
