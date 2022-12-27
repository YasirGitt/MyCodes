package com.methodcall;

import java.util.Scanner;

public class Truck {
	public static void findtime(int speed, int distance) {
		double s=speed*(18/5.0); // converting m/s to km/hrs
		double time=distance/s;
		time=Math.round(time);
		System.out.println("Total time taken by truck is: "+time);
		System.out.println("Total distance cover: "+distance+" km");
		System.out.println("To speed of truck is: "+speed+" km/hrs");
	}
	public static void getbook(String bookname, float month) {
		System.out.println("Book name is: "+bookname);
		System.out.println("Rented for: "+month);
	}
	public static void mn(int a, int b) {
		
		
		System.out.println("Minimum value among "+a+" and "+b+" is "+Math.min(a, b));
		System.out.println("Maximum value among "+a+" and "+b+" is "+Math.max(a, b));
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter speed of truck");
		int speed=sc.nextInt();
		System.out.println("Enter cover distance");
		int distance=sc.nextInt();
		System.out.println("Enter name of book");
		String bookname=sc.next();
		System.out.println("Enter month");
		float month=sc.nextFloat();
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter secend no");
		int b=sc.nextInt();
		getbook(bookname,month);
		findtime(speed,distance);
		mn(a,b);
		sc.close();
		
	}
}
