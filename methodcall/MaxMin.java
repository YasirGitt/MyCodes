package com.methodcall;

import java.util.Scanner;

public class MaxMin {
	public static void input(double a, double b) {
		double max=Math.max(a,b);
		double min=Math.min(a,b);
		System.out.println("Minimum among "+a+" & "+b+" is "+min);
		System.out.println("Maximum among "+a+" & "+b+" is "+max);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value");
		double a=sc.nextDouble();
		System.out.println("Enter 2nd value");
		double b=sc.nextDouble();
		input(a,b);
		sc.close();
	}

}
