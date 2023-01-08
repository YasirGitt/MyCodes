package com.WrapObject;

import java.util.Scanner;

public class Demotrim {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Before trim: ");
		System.out.println(str);
		String ncopy=str.trim();
		System.out.println("afer trim: ");
		System.out.println(ncopy);

		}
	}
