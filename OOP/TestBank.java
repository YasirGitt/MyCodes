package com.qspider.OOP;

import java.util.Scanner;

public class TestBank {
	public static void main( String []args) {
		Scanner sc= new Scanner(System.in);
		double a;
		long ac;
		System.out.println("Enter amount to withdrwan");
		a=sc.nextDouble();
		System.out.println("Enter a/c no");
		ac=sc.nextLong();
		Bank b= new Bank();
		b.withdraw(a,ac);
		b.checkbalance();
	}

}
