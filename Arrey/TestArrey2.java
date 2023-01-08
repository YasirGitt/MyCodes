package com.Arrey;

public class TestArrey2 {
	public static void main(String[] args) {
		int a[]= new int[10];
		
		System.out.println("befor declare");
		System.out.println("cell contains at o: "+a[0]);
	    System.out.println("cell contains at 1: "+a[1]);
	    System.out.println("cell contains at 2: "+a[2]);
	    System.out.println("cell contains at 3: "+a[3]);
	    System.out.println("cell contains at 4: "+a[4]);
	    System.out.println("cell conatains at 5 "+a[5]);
		

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println();
		System.out.println("After declare");
		System.out.println("cell contains at o: "+a[0]);
	    System.out.println("cell contains at 1: "+a[1]);
	    System.out.println("cell contains at 2: "+a[2]);
	    System.out.println("cell contains at 3: "+a[3]);
	    System.out.println("cell contains at 4: "+a[4]);
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
	
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.println("cell contains at "+i+" is "+a[i]);
			
			

			}
		}
	    
	}
