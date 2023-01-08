package com.WrapObject;
//wap to enter a string and Uc the no of uppercase letter, lowercase letter and dits available in the string.

public class CheckDL {
	public static void main(String[] args) {
		String str="Java Was introduced in 1995 %";
	int	Uc=0, d=0,Lc=0,special_wspace=0;
	

	
	for(int i=0; i<str.length(); i++) {
	
		char ch=str.charAt(i);
	
	
		if((str.charAt(i)>='A')&&(str.charAt(i)<='Z')) {
			Uc++;
		}
		else if((str.charAt(i)>='1')&&(str.charAt(i)<='9')) {
			d++;
			
		}
		else if((str.charAt(i)>='a')&&(str.charAt(i)<='z')) {
			Lc++;
		}
		else {
			special_wspace++;
		}
	}
	
			System.out.println("Uppercase letter: "+Uc);
			System.out.println("Lowercase letter: "+Lc);
			System.out.println("digit letter: "+d);
			System.out.println("special_wspace letter: "+special_wspace);
		
			
		
	}
}
	

