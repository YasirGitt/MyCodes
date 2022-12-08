package com.Method;

import java.util.Scanner;

public class MultipleMethod {
	public static void add(int a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
		
	}
	public static void div(int a, double b)
	{
		double div=a/b;
		System.out.println("Div of "+a+" and "+b+" is "+div);
	}
	public static void pro(int a, double b)
	{
		double pro=a*b;
		System.out.println("Product of "+a+" and "+b+" is "+pro);
	}
	public static void sub(int a, double b)
	{
		double sub=a/b;
		System.out.println("Substraction of "+a+" and "+b+" is ");
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
		
		System.out.println("additon of "+a+" and "+b);
		add(a,b);
		System.out.println();
		System.out.println("Division of"+a+" and "+b);
		div(a,b);
		System.out.println();
		System.out.println("Product of "+a+" and "+b);
		pro(a,b);
		System.out.println();
		System.out.println("Substraction of "+a+" and "+b);
		sub(a,b);
	}

}
