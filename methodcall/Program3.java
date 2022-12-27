package com.methodcall;

public class Program3 {
	public void m11() {
		System.out.println("m11 excuted");
	}
	public void m12() {
		System.out.println("m12 excuted");
	}
	public static void m13() {
		System.out.println("m13 excuted");
		Program3 p= new Program3();
		p.m11();
		p.m12();
	}
		public static void main ( String []args) {
		m13();
	
		System.out.println("me excution ends");
	}

}
