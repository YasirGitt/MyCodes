package com.WrapObject;

import java.util.Scanner;

public class Demu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String strcopy=str.trim();
		int ln=strcopy.length();
		int wc=1;
		for(int i=0; i<ln; i++) {
			char ch=strcopy.charAt(i);
			if(ch==' ') {
				wc++;
				
			}
		}
		System.out.println("no of word ar: "+wc);
	}

}

/* wap to input a character check if it is an alphabate. if it is an alphabate 
 then convet in to upper case then display the next five character in circular
 alphabatical list including the modifier character.*/