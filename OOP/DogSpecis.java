package com.qspider.OOP;

public class DogSpecis {
	public static void main (String []args) {
		Dog d1= new Dog();
		Dog d2= new Dog();
		
		d1.breed="Selties";
		d1.color="White";
		d1.life=12.5;
		d1.age=5.2;
		d1.height="30.5 cm";
		d1.weight=6.4;
		d1.origin="Scotland";
		

		
		d2.breed="Siberian husky";
		d2.color="white and grey shade";
		d2.age=2.7;
		d2.life=12.4;
		d2.height="40.5 cm";
		d2.weight=16.5;
		d2.origin="Siberia";
		
	
		System.out.println("Name of Dog : "+d1.breed);
		System.out.println("Colour      : "+d1.color);
		System.out.println("Age         : "+d1.age+" year");
		System.out.println("Height      : "+d1.height);
		System.out.println("Weight      : "+d1.weight);
		System.out.println("Life        : "+d1.life);
		System.out.println("Origin      : "+d1.origin);
		System.out.println("------");
		Dog.bark();
		d1.bite();
		d1.eat();
		d1.run();
		d1.sound();
		
		System.out.println("\n-----------------------------------\n");

		System.out.println("Name of Dog : "+d2.breed);
		System.out.println("Colour      : "+d2.color);
		System.out.println("Age         : "+d2.age+" year");
		System.out.println("Height      : "+d2.height);
		System.out.println("Weight      : "+d1.weight);
		System.out.println("Life        : "+d1.life);
		System.out.println("Origin      : "+d1.origin);
		System.out.println("------");

		Dog.bark();
		d2.bite();
		d2.eat();
		d2.run();
		d2.sound();
		
		
		
	}


}
