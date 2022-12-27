package com.qspider.OOP;

import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		String name,gender,Eid,Job,shift,cab,company;
		long phno;
		int age,salary;
		char a;
		
		
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter Employee id");
		Eid=sc.nextLine();
		System.out.println("Enter Designation");
		Job=sc.nextLine();
		System.out.println("Cab availibility");
		cab=sc.nextLine();
		System.out.println("Enter company name");
		company=sc.nextLine();
		System.out.println("Enter phone no");
		phno=sc.nextLong();
		System.out.println("Enter gender");
		gender=sc.next();
		System.out.println("Enter age of emp");
		age=sc.nextInt();
		System.out.println("Enter shift of job");
		shift=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter Grad");
		a=sc.next().charAt(0) */
		
		
		
		
	
		Employees e1= new Employees("Yasir raza","Male", "TCS008","Automation Eng",8920839821L, 25, "Night shift", 75000, 'A', "Cab availible", "TCS");
		System.out.println("\n------------------\n");
		Employees e2= new Employees("Jagannath","Male", "TCS009","Automation Eng",8920839821L, 26, "Day shift", 75000, 'A', "Cab availible", "TCS");
		System.out.println("\n------------------\n");
		Employees e3= new Employees("sakeeb","male","tcs08","manual testing",909930809L, 78,"night shift",67000,'B',"can not available","BCS");
	
		
		//Employees e5=new Employees(name,gender,Eid,Job,phno,age,shift,salary,a,cab,company);
		//Employees e6=new Employees(name,gender,Eid,Job,phno,age,shift,salary,a,cab,company);
	}

}
