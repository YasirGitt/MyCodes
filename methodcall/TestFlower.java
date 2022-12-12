package com.methodcall;

public class TestFlower {
 public static void main(String[] args) {
	Flower f1= new Flower();
	Flower f2= new Flower();
	Flower f3= new Flower();
	Flower f4= new Flower();
	
	System.out.println("Operation performed by f1");
	f1.rose();
	f1.water();
	f1.soil();
	f1.spring();
	
	System.out.println("\n***********\n");
	
	System.out.println("Operation performed by f2");
	f2.rose();
	f2.water();
	f2.soil();
	f2.spring();
	
	System.out.println("\n***********\n");
	
	System.out.println("Operation performed by f3");
	f3.rose();
	f3.water();
	f3.soil();
	f3.spring();
	
	System.out.println("\n***********\n");
	
	System.out.println("Operation performed by f4");
	f4.rose();
	f4.water();
	f4.soil();
	f4.spring();
	
}
}

