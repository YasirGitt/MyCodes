package com.methodcall;

import java.util.Scanner;

public class PreD {
	public static void call(double a, double b, String name, char ch) {
		System.out.println("Value of a "+a+" and value of b "+b);
		System.out.println("Max value is: "+Math.max(a, b));
		System.out.println("Min value is: "+Math.min(a, b));
		System.out.println("Sqrt of a is: "+Math.sqrt(a));
		System.out.println("Cbrt of b  is: "+Math.cbrt(b));
		System.out.println("squre of a is: "+Math.pow(a,b));
		System.out.println("Round up of a is: "+Math.ceil(a));
		System.out.println("Round down of b is: "+Math.floor(b));
		System.out.println("Round of b is: "+Math.round(b));
		System.out.println("Name is: "+name);
		System.out.println("Charactor is: "+ch);
		
	}
	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Name of your");
	   String name=sc.nextLine();
	   System.out.println("Enter any charactor");
       char c=sc.next().charAt(0);
	   System.out.println("Enter value of a");
	   double a=sc.nextDouble();
	   System.out.println("Enter value of b");
	   double b=sc.nextDouble();

	   call(a,b,name,c);
	   sc.close();
	}

}
