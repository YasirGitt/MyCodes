package com.Method;
import java.util.Scanner;
public class UpperLowerLetter {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	char ch,result;
	System.out.println(" Enter a character to get its Upper or lower case ");
	ch=sc.next().charAt(0);
	
	if(Character.isUpperCase(ch))
	{
	System.out.println(ch+" is a UpperCase ");
	}
	else if(Character.isLowerCase(ch))
	{
		System.out.println(ch+" is LowerCase ");
	}
	else
	{
		System.out.println(ch+" is not a Letter neiter Digit ");
	}
}
}



	
