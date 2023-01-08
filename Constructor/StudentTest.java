package com.Constructor;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter collage name");
		String collage=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		System.out.println("Enter mobile no");
		long mob=sc.nextLong();
		
		Student s1= new Student(name,age,collage,rollno,mob);
		s1.displayData();
		sc.close();
	
	}

}
