package com.WrapObject;
/*wap to enter a string and count the no of uppercase letter
lowercase letter and digits, whitespace, word available in the string.*/

public class CountD {
	public static void main(String[] args) {
		String s="Everyone Looks Very Happy 1199 #$";
		
		int Upper=0,lower=0,digit=0,wspace=0,special=0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
		if(Character.isUpperCase(c)) {
			Upper++;
		}
		else if(Character.isLetter(c)) {
			lower++;
		}
		else if(Character.isDigit(c)) {
			digit++;
		}
		else if(Character.isWhitespace(c)) {
			wspace++;
			
		}
		else {
			special++;
		
	
		}
	}

		System.out.println("Uppercase in string: "+Upper);
		System.out.println("Lowercase in string: "+lower);
		System.out.println("Digit in String: "+digit);
	    System.out.println("wspace in string: "+wspace);
	    System.out.println("special in string: "+special);
	    System.out.println("word in string: "+(wspace+1));
	
		
}
}



	
