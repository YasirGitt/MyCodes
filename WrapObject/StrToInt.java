package com.WrapObject;

public class StrToInt {
	public static void main(String[]  args) {
		String str1="100";
		String str2="200";
		System.out.println("Conversion happen String to int");
		System.out.println("Befor conversion sum is: "+(str1+str2));
		
		int i1=Integer.parseInt(str1);
		int i2=Integer.parseInt(str2);
		
		System.out.println("After conversion sum is: "+(i1+i2));
		System.out.println("Conversion happen int to String");
		
		int a=100;
		int b=200;
		
		System.out.println("Before conversion sum is: "+(a+b));
		
		String str3=Integer.toString(a);
		String str4=Integer.toString(b);
		
		System.out.println("After conversion sum is: "+(str3+str4));
		
		
		
	}

}
