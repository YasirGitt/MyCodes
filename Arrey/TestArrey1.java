package com.Arrey;
//program to demonstrate creation of array using with new keyword.
//program to demonstrate the default value array.

public class TestArrey1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		
		a[4]=60;
		a[2]=40;
		a[0]=30;
		
		System.out.println("Element at a[0]is: "+a[0]);
		System.out.println("Element at a[1]is: "+a[1]);
		System.out.println("Element at a[2]is: "+a[2]);
		System.out.println("Element at a[3]is: "+a[3]);
		System.out.println("Element at a[4]is: "+a[4]);
		
		
	}

}
/* if we using creation of array using with "new" keyword then we get
by default value if we not assigned them.
output---
Element at a[0]is: 30    assigned value
Element at a[1]is: 0     default value
Element at a[2]is: 40    assigned value
Element at a[3]is: 0     default value
Element at a[4]is: 60 	 assigned value
*/