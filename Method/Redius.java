package com.Method;

import java.util.Scanner;

public class Redius {
	public static void Red( double d ) {
		double redius= d/2.0;
		System.out.println("Redius of circle is "+ redius);
	}
	public static void main ( String []args)
	{
		Scanner sc= new Scanner ( System.in);
		double d;
		System.out.println("Enter a no to get redius");
		d=sc.nextDouble();
		System.out.println("Excution start");
		Red(d);
		System.out.println("Excution ends");
		
	}

}
