package com.Arrey;

public class WithoutNew {
	public static void main(String[] args) {
		int a[]= {10,30,40,50,60};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Elment at "+i+" is "+a[i]);
		}
		System.out.println();
		System.out.println("Element at 1 is: "+a[1]);
		System.out.println("Element at 4 is: "+a[4]);
		System.out.println("Element at 2 is: "+a[2]);
		System.out.println("Element at 0 is: "+a[0]);
		System.out.println("Element at 3 is: "+a[3]);
		System.out.println("Element at 3 is: "+a[5]);
		
	}

}

// if we print beyond the size of array then we will get runtime error
