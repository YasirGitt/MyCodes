package com.Method;

import java.util.Scanner;

public class AdditionScnr {
public static void add(int a, int b)
{
	int sum= a+b;
	System.out.println("Sum of"+a+" and "+b+" is "+sum);
}

public static void main (String []args)
{
	Scanner sc= new Scanner(System.in);
	int a,b;
	System.out.println("Enter 1st value");
	a=sc.nextInt();
	System.out.println("Enter 2nd value");
	b=sc.nextInt();
	
	System.out.println("Excution starts");
	add(a,b);
	System.out.println("Excution ends");
}
}
