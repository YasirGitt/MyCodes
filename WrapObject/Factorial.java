package com.WrapObject;

import java.util.Scanner;

//wap to input a no and display the factorial of the no.

public class Factorial {
	public static void fc(int n) {
		int fac=1;
		for( int i=1; i<=n; i++)  
			fac=fac*i;  // 1x1,1x2,2x3,6x4,24x5,
		System.out.println("factorial "+fac);
		
	}
	
	public static void fac(int n) {
		int n1=n*factorial(n-1);// wrapperclas object to get factorial.
		System.out.println(n1);
		
	}

	  public static int factorial(int n) {
	    if (n == 0) {
	      return 1;
	    } 
	    else {
	      return n * factorial(n-1);

		}
	}
	  public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no to know factorial of it");
		int n=sc.nextInt();
		System.out.println(factorial(n));
		fac(n);
		fc(n);
	}

}
