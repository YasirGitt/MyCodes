package com.Method;

import java.util.Scanner;

public class SquareNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		double result;
		System.out.println("Enter a no to get its Square");
		num=sc.nextInt();
		result=Math.pow(num, 2);
		
		System.out.println(result+" is Square of "+num);
		
		
	

	}

}
