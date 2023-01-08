package com.WrapObject;
// wap to input a string and display the character present at index no 2.
// wap to input a string and display the string in following pattern.
/*eq- input is qspider then must be q, qs, qsp,qspi,qspid,qspide,qspider*/
public class Demo {
	
	public static void main(String[] args) {
		String str="Qspider";
		System.out.println("index no 2 is: "+str.charAt(2));
		System.out.println("Index no 3 is: "+str.charAt(3));
		System.out.println("index no 4 is: "+str.charAt(4));
		System.out.println("length of string is: "+str.length());
		
		for (int i=0; i<=7; i++) {
			
			for (int j=0; j<=i; j++) {
				
				System.out.print(str.charAt(j));
			}
	
			System.out.println();
		}
	}
}
