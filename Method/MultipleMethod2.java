package com.Method;
import java.util.Scanner;
public class MultipleMethod2 {

     void add(int a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
		
	}
	void div(int a, double b)
	{
		double div=a/b;
		System.out.println("Div of "+a+" and "+b+" is "+div);
	}
	void pro(int a, double b)
	{
		double pro=a*b;
		System.out.println("Product of "+a+" and "+b+" is "+pro);
	}
	void sub(int a, double b)
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
		new MultipleMethod2().add(a,b);
		System.out.println();
		System.out.println("Division of"+a+" and "+b);
		new MultipleMethod2().div(a,b);
		System.out.println();
		System.out.println("Product of "+a+" and "+b);
		new MultipleMethod2().pro(a,b);
		System.out.println();
		System.out.println("Substraction of "+a+" and "+b);
		new MultipleMethod2().sub(a,b);
	}

}

