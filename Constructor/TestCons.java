package com.Constructor;

public class TestCons {
	int a;
	float f;
	TestCons(int a, float f){
		
		System.out.println("Constructor executed");
		this.a=a;
		this.f=f;
	}
	public void Test() {
		System.out.println(a);
		System.out.println(f);
		
	}
	public static void main(String[] args) {
		System.out.println("main start");
		//TestCons t1= new TestCons(23,4.5f);
		//t1.Test();
		System.out.println("main end");
		
		// for execution of constructor we need create an object. and call that method.if created.
	}

}
