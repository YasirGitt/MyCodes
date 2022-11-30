package com.Method;
import java.util.Scanner;
public class CheckLetter {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	char ch,result;
	System.out.println(" Enter a no to get its charachter or not ");
	ch=sc.next().charAt(0);
	
	if(Character.isLetter(ch))
	{
	System.out.println(ch+" is a Letter ");
	}
	else if(Character.isDigit(ch))
	{
		System.out.println(ch+" is Digit ");
	}
	else
	{
		System.out.println(ch+" is not a Letter neiter Digit ");
	}
}
}



	
