package com.methodcall;

import java.util.Scanner;

/* wap for circle. find the radius of circle based on given diameter
the diameter must be in decimal value
wap a program for a scientifuc calculater declear two non static method
the first method will recieve an input from the user and 2nd method
will perform some operation and print them. the operation are as
follow display the rounded value of number enter by the user.
display the sqrt of number enter by the user. display the cbrt of the
number enter by the user. display the rounded down value of the number
enter by the user. 
*/

public class Circle {
	public void cir(double d) {
		double red= d/2.0;
		System.out.println(red+" redius of circle");
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				double d;
		System.out.println("Enter a decimal value to check redius");
		d=sc.nextDouble();
		Circle r= new Circle();
		r.cir(d);
	
	}

}
