package com.methodcall;

public class NSMSM_NSVSV {
	static int a;
	int b;
	String c;
	public void mic() {
		System.out.println("mic testing is ok");
	}
	public static void speaker() {
		System.out.println("speaker testing is ok");
	}
	public static void main(String []args) {
		System.out.println("main start");
		NSMSM_NSVSV n= new NSMSM_NSVSV();
		System.out.println(a);
		System.out.println(n.b);
		System.out.println(n.c);
		n.mic();
		speaker();
	}
		
	}

