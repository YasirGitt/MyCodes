package com.methodcall;

public class TestCar {
	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println("Operation start by c");
        c.petrol();
		c.Engine();
		c.drive();
		c.breaking();
		System.out.println("\n***********\n");
		System.out.println("Operation start by c1");
		c1.petrol();
		c1.Engine();
		c1.drive();
		c1.breaking();
		System.out.println("\n***********\n");
		System.out.println("Operation start by c2");
		c2.petrol();
		c2.Engine();
		c2.drive();
		c2.breaking();
		
		System.out.println("\n***********\n");
		System.out.println("Operation start by c3");
		c3.petrol();
		c3.Engine();
		c3.drive();
		c3.breaking();
	}

}
