package com.Method;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a;
		double result;
		
		System.out.println("Enter a no to get its Cube root");
		a=sc.nextInt();
		sc.close();
		
		result = Math.cbrt(a);
		System.out.println("Cube root of "+a+" is "+result);

	}

}
