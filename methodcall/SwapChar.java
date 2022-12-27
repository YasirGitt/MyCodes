package com.methodcall;

import java.util.Scanner;

public class SwapChar {
	public static void swap(char ch1, char ch2) {
		System.out.println("Before swapping: ");
		System.out.println("Value of ch1 is: "+ch1);
		System.out.println("Value of ch2 is: "+ch2);
		char ch3;
		ch3=ch1;
		ch1=ch2;
		ch2=ch3;
		System.out.println("After swapping is: ");
		System.out.println("Value of ch1: "+ch1);
		System.out.println("Value of ch2: "+ch2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first character");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter secend value");
		char ch2=sc.next().charAt(0);
		swap(ch1,ch2);
		sc.close();

	}

}
