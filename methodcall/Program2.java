package com.methodcall;

public class Program2 {
	public static void m1() {
		System.out.println("m1 excuted");
	}
	public void m2() {
		System.out.println("m2 excuted");
		m1();
	}
	public static void main (String []args) {
		System.out.println("main start");
		Program2 p= new Program2();
		p.m2();
		System.out.println("main ends");
	}

}
