package com.qspider.OOP;

public class Customer {
	String name;
	int age;
	long phno;
	String bgroup;
	
	Customer(String name, int age, long phno, String bgroup)
	{
		
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.bgroup=bgroup;
		System.out.println("Customer name is: "+name);
		System.out.println("Customer age is: "+age);
		System.out.println("Customer phno is: "+phno);
		System.out.println("Customer blood group is: "+bgroup);
		
	}

}
