package com.Method;

import java.util.Scanner;

public class MinMaxValue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter a first value");
		a=sc.nextInt();
		System.out.println("Ente secend value");
		b=sc.nextInt();
		
		if min=(Math.min(a,b));
		
	  
		{
			System.out.println(min+" is a minmum value");
		}
		else if max=(Math.max(a, b));
		{
			System.out.println(max+" is a Maximum value");
		}
		else
		{
			System.out.println("null");
		}
		

	}

}
