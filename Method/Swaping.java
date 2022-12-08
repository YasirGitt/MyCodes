package com.Method;

import java.util.Scanner;

public class Swaping {
	public static void swap(int a, int b) {
	    a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : "+a+" b : "+b);
	}
	public static void swap1(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a : "+a+" b : "+b);
	}
	public static void swap2(int a, int b) {

		a=a*b;
		a=a/b;
		b=a/b;
		System.out.println("a : "+a+" b : "+b);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		
		System.out.println("Swapping value from a to b and b to a");
		swap(a,b);
		swap1(a,b);
		swap(a,b);
		

	}

}
