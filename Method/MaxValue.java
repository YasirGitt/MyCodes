package com.Method;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a,b,max;
		System.out.println("Enter a first value");
		a=sc.nextInt();
		System.out.println("Enter a secend value");
		b=sc.nextInt();
		
		max=Math.max(a, b);
		System.out.println(max+" is a Max value of "+a+" and "+b);
	}

}
