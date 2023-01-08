package com.Constructor;

public class Student {
	String name;// non static variable.
	int age;
	int rollno;
	long mob;
	String collage;
	
	//Constructor for NSV declaration.
	Student(String name, int age, String collage,int rollno, long mob){
		
	//keyword.NSV=LV
		this.name=name;
		this.age=age;
		this.collage=collage;
		this.rollno=rollno;
		this.mob=mob;
		
		
	}
	// non static method for displaying the data.
	public void displayData() {
		System.out.println("Student details-----");
		System.out.println("Student 1");
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("rollno: "+rollno);
		System.out.println("Collage name: "+collage);
		System.out.println("mobile: "+mob);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Student s1= new Student("Yasir",25,"AFUT",3455,892083092);
		s1.displayData();
		Student s2= new Student("Rocky",44,"gbtg",644,787987945);
		s2.displayData();
	}

}
