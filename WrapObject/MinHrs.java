package com.WrapObject;
//wap to input hrs and minute covert hrs to minute and minute to hrs

import java.util.Scanner;

public class MinHrs {
	public static void ConvertHM_MH() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter hrs");
		double hrs=sc.nextDouble();
		System.out.println("enter min");
		double min=sc.nextDouble();
		double f=hrs*60;
		double f2=min/60;
		System.out.println(hrs+" hrs into min: "+f);
		System.out.println(min+" min into hrs: "+f2);
	}
		
		
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter hrs: ");
		double d=sc.nextDouble();
		System.out.println("Enter Min: ");
		double d2=sc.nextDouble();
		
		double d3=d*60;
		double d4=d2/60;
		
		System.out.println(d+" hrs is equal to: "+d3+" minut");
		System.out.println(d2+" Min is equal to: "+d4+" horse");
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter hrs");
		double a=sc.nextDouble();
		System.out.println("Enter min");
		double b=sc.nextDouble();*/
		ConvertHM_MH();	
		
		
	}
	

}
