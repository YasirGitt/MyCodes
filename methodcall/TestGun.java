package com.methodcall;

public class TestGun {
	public static void main(String[] args) {
		Gun g1= new Gun();
		Gun g2= new Gun();
		Gun g3= new Gun();
		Gun g4= new Gun();
		
		System.out.println("Operation performed by g1");
		g1.bullet();
		g1.triger();
		g1.fire();
		g1.reload();
		
		System.out.println("\n*****************\n");
		System.out.println("Operation performed by g2");
		g2.bullet();
		g2.triger();
		g2.fire();
		g2.reload();
		
		System.out.println("\n*****************\n");
		System.out.println("Operation performed by g3");
		g3.bullet();
		g3.triger();
		g3.fire();
		g3.reload();
		
		System.out.println("\n*****************\n");
		System.out.println("Operation performed by g4");
		g4.bullet();
		g4.triger();
		g4.fire();
		g4.reload();
				
	}

}
