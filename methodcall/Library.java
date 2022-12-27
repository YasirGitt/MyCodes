package com.methodcall;

import java.util.Scanner;

public class Library {
	public static void getbook(String bookname, float month) {
		System.out.println("Book name "+bookname);
		if(month<=1)
			System.out.println("issued for "+month+" month");
		else
			System.out.println("Issued for "+month+" months");
	}
	public static void main(String[] args) {
		String bookname;
		float month;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a book name");
		bookname=sc.nextLine();
		System.out.println("Enter for month");
		month=sc.nextFloat();
		getbook(bookname,month);
		sc.close();
	}

}
