package com.Method;

import java.util.Scanner;

public class AddIntDouble {
	public static void add(int a, double b)
	{

		double sum=a+b;
		System.out.println("Sum of"+a+" and "+b+" is "+sum);
		
	}
	public static void main ( String []args)
	{
		Scanner sc= new Scanner(System.in);
		int a;
		double b;
		System.out.println("Enter integer value");
		a=sc.nextInt();
		System.out.println("Enter decimal value");
		b=sc.nextDouble();
		
		System.out.println("main start");
		add(a,b);
		System.out.println("main ends");
	}

}
