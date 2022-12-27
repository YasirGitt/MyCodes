package com.qspider.OOP;

public class Bank {
	public void withdraw(long actno, int amount) {
		System.out.println(" long, int parameter");
		System.out.println(amount+" Withdrawn from your account");
	}
	public void withdraw(int amount, long actno) {
		System.out.println(" int , long parameter");
		System.out.println(amount+" withdrwan from your account");
	}
	public void withdraw(double amount, long actno) {
		System.out.println("dount amount, long actno parameter");
		System.out.println(amount+" withdrwan from your account");
	}
	public void withdraw(long actno, double amount) {
		System.out.println("lont actno, double amount parameter");
		System.out.println(amount+" withdrwan from your account");
	}
	public void withdraw(double amount) {
		System.out.println(" dount amount parameter");
		System.out.println(amount+" withdrwan from your account");
	}
	public void withdraw(int amount) {
		System.out.println(" int parameter");
		System.out.println(amount+" withdrwan from your account");
	}
	
	public void checkbalance() {
		System.out.println(" available balance in your a/c Rs****");
	}

}