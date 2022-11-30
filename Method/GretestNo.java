package com.Method;

import java.util.Scanner;

public class GretestNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a,b,min;
		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter secend value");
		b=sc.nextInt();
		
		min=Math.min(a, b);
		System.out.println(min+" is a min value of "+a+" and "+b);
		
	}

}
