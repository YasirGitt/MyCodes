package com.methodcall;

public class AllInOne {
	public void all() {
		Car c= new Car();
		Flower f= new Flower();
		Animal a= new Animal();
		Gun g= new Gun();
		
		System.out.println("Operation done by a Man");
		c.petrol();
		c.Engine();
		c.drive();
		c.breaking();
		f.rose();
		f.water();
		f.soil();
		f.spring();
		a.tiger();
		a.food();
		a.eat();
		a.sleep();
		g.bullet();
		g.triger();
		g.fire();
		g.reload();
		
	}
	public static void main(String[] args) {
		AllInOne a= new AllInOne();
		a.all();
		
	}

}
