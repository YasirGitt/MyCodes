package com.methodcall;

import java.util.Scanner;

public class MilkhaSingh {
	public static void findtime(int speed, int distance) {
		double s=speed*(18/5.0);
		
		double time=distance/s;
		time=Math.round(time);
		System.out.println("Time taken is approxmately "+time);
	}
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int speed,distance;
		System.out.println("Enter speed");
		speed=sc.nextInt();
		System.out.println("Enter distance");
		distance=sc.nextInt();
		sc.close();
		findtime(speed,distance);
		
	}

}
