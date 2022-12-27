package com.qspider.OOP;

public class Employees {
	
	String name;
	String gender;
	String eid;
	String job;
	long phno;
	int age;
	String shift;
	int salary;
	char rating;
	String cab;
	String company;
	
	Employees(String name,String gender,String eid,String job,long phno,int age,String shift,int salary,char rating,String cab,String company){
		
		this.name=name;
		this.gender=gender;
		this.eid=eid;
		this.job=job;
		this.phno=phno;
		this.age=age;
		this.shift=shift;
		this.salary=salary;
		this.rating=rating;
		this.cab=cab;
		this.company=company;
		
		System.out.println("Name         : "+name);
		System.out.println("Gender       : "+gender);
		System.out.println("EID          : "+eid);
		System.out.println("Designation  : "+job);
		System.out.println("Phone no     : "+phno);
		System.out.println("Age          : "+age);
		System.out.println("Working shift: "+shift);
		System.out.println("Salary       : "+salary);
		System.out.println("Performance  : "+rating);
		System.out.println("Cab service  : "+cab);
		System.out.println("Company name : "+company);

		
	}
}
