package com.methodcall;

public class TestStudent {
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		System.out.println("Operation performed by s1");
		s1.study();
		s2.eat();
		s3.sleep();
		s4.play();
		System.out.println("\n****************\n");
		System.out.println("Operation performed by s2");
		s1.study();
		s2.eat();
		s3.sleep();
		s4.play();
		System.out.println("\n****************\n");
		System.out.println("Operation performed by s3");
		s1.study();
		s2.eat();
		s3.sleep();
		s4.play();
		System.out.println("\n****************\n");
		System.out.println("Operation performed by s4");
		s1.study();
		s2.eat();
		s3.sleep();
		s4.play();
	}

}
