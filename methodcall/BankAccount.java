package com.methodcall;

public class BankAccount {
	public void sendsms() {
		System.out.println("Rs 2000 withdrwan from your a/c 88****12");
		
	}
	public void withdrwan() {
		System.out.println("Money withdrwan successfully");
		sendsms();
		
	}
	public static void main (String []args) {
		System.out.println("Main start");
		BankAccount b= new BankAccount();
		b.withdrwan();
	}

}
