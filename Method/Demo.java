package com.Method;

import java.util.Scanner;

public class Demo{
	
	
	public static void add()
	
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter two no to get add ");
		a=sc.nextInt();
	    System.out.println("Enter secend no to get sum ");
	    b=sc.nextInt();
		System.out.println(" Sum of "+(a+b));
	}
	public static void main(String[] args) {

	
		Demo.disp();
		Demo.add();
	
		

	}
	public static void disp()
	{
		System.out.println(" Animation display ");
	}
}