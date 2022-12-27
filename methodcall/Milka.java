package com.methodcall;

import java.util.Scanner;

public class Milka {
	public static double input(double speed) {
		return speed;
	}
	public static void findtime(int distance) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the speed");
		double speed=sc.nextDouble();
		speed=speed*(18/5.0);
		double result=input(speed);
		double time=distance/result;
		time=Math.round(time);
		System.out.println("The time taken by approxmately "+time);
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter distance ");
	int distance=sc.nextInt();
	findtime(distance);
	

}
}