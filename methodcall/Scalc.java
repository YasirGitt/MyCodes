package com.methodcall;

import java.util.Scanner;

public class Scalc {
	public void input() {
		Scanner sc= new Scanner(System.in);
		double n;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		cal(n);
	}
	public void cal(double n) {
		double sqrt,cbrt;
		int up,down;
		
		sqrt=Math.sqrt(n);
		cbrt=Math.cbrt(n);
		up=(int) Math.ceil(n);
		down=(int) Math.floor(n);
		System.out.println("sqrt is : "+sqrt);
		System.out.println("cbrt is : "+cbrt);
		System.out.println("round up is : "+up);
		System.out.println("round down is : "+down);
	}
	public static void main(String[] args) {
		Scalc s1= new Scalc();
		s1.input();
		
	}


}
