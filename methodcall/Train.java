package com.methodcall;

import java.util.Scanner;

public class Train {
	public static void findDistance(int speed, int time) {
		System.out.println("speed "+speed+" km/hr");
		System.out.println("Time "+time+" hrs");
		int distance=speed*time;
		System.out.println("Distance covered by train is "+time+" hourse is "+distance+" km/hrs");
		
	}
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the speed");
	int speed=sc.nextInt();
	System.out.println("Enter the time");
	int time=sc.nextInt();
	findDistance(speed,time);
	sc.close();
}

}
