package com.WrapObject;

import java.util.Scanner;

//  wap to define a method that we receive 3 integer and display the greatest among them
public class Greatest1 {
	public void greatest1(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println("Greatest one is: "+a);
		}
		else if(b>a&&b>c) {
			System.out.println("Greatest one is: "+b);
		}
		else {
			System.out.println("Greatest one is: "+c);
		}
	}
	public static void main(String[] args) {
		Greatest1 g= new Greatest1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st value");
		int a=sc.nextInt();
		System.out.println("Enter 1st value");
		int b=sc.nextInt();
		System.out.println("Enter 1st value");
		int c=sc.nextInt();
		g.greatest1(a,b,c);
	}

}
