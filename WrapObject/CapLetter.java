package com.WrapObject;
/* wap to input a character check and display weather it is capital letter
   or small letter. without using Pre-defined method.*/

import java.util.Scanner;

public class CapLetter {
	public static void Cap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character to check cap or small");
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+" is Capital letter");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println(ch+" is Small letter");
		}
		else {
			System.out.println(ch+" is not a letter");
		}
	}
public static void main (String[] args) {
	Cap();
	
}
}