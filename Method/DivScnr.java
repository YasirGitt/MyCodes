package com.Method;

import java.util.Scanner;

public class DivScnr {
public static void Div(double a, double b)
{
	double result= a/b;
	System.out.println("Division of"+a+" by "+b+" is "+result);
}

public static void main (String []args)
{
	Scanner sc= new Scanner(System.in);
	int x,y;
	System.out.println("Enter a divident");
	x=sc.nextInt();
	System.out.println("Enter a diviser");
	y=sc.nextInt();
	
	System.out.println("Exction starts");
	Div(x,y);
	System.out.println("Excution ends");
}
}
