package com.methodcall;

import java.util.Scanner;

/*wap a program for a scientifuc calculater declear two non static method
the first method will recieve an input from the user and 2nd method
will perform some operation and print them. the operation are as
follow display the rounded value of number enter by the user.
display the sqrt of number enter by the user. display the cbrt of the
number enter by the user. display the rounded down value of the number
enter by the user. */

public class ScientificCal {
	public void m1(double d) {
		m2(d);
			
		
	}
	public void m2(double d) {
		double crt, srt;
		int up, down;
		up=(int) Math.ceil(d);
		down=(int) Math.floor(d);
		srt=Math.sqrt(d);
		crt=Math.cbrt(d);
		
		System.out.println("Round up "+up);
		System.out.println("round down "+down);
		System.out.println("sqrt "+srt);
		System.out.println("cbrt "+crt);
			
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double d;
		System.out.println("Enter a no");
		d=sc.nextDouble();
		
		ScientificCal s1= new ScientificCal();
		s1.m1(d);
		
	}

}
