package com.methodcall;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1= new Animal();
		Animal a2=new Animal();
		Animal a3=new Animal();
		Animal a4=new Animal();
		
		System.out.println("Operation performed by Tiger a1");
		a1.tiger();
		a1.food();
		a1.eat();
		a1.sleep();
		
		System.out.println("\n************\n");
		
		System.out.println("Operation performed by Tiger a2");
		a2.tiger();
		a2.food();
		a2.eat();
		a2.sleep();
		
		System.out.println("\n************\n");
		
		System.out.println("Operation performed by Tiger a3");
		a3.tiger();
		a3.food();
		a3.eat();
		a3.sleep();
		
		System.out.println("\n************\n");
		
		System.out.println("Operation performed by Tiger a4");
		a4.tiger();
		a4.food();
		a4.eat();
		a4.sleep();
		
	}

}
