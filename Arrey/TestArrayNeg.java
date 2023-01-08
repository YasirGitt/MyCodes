package com.Arrey;
// can we declared an array with negative size

public class TestArrayNeg {
	public static void main(String[] args) {
		int a[]=new int[-5];
		a[-1]=50;
		System.out.println(a);
	}

}

/* 
can we declared an array with negative size
no can't if declare then we will get this-

Exception in thread "main" java.lang.NegativeArraySizeException: -5
at com.Arrey.TestArray2.main(TestArray2.java:5)

*/