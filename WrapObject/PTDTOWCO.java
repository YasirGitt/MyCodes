package com.WrapObject;

public class PTDTOWCO {
	public static void main(String[] args) {
		byte b=126;
		short c=1234;
		int i=12345;
		long l=1234567;
		float f=(float) 2035.6;
		double d=23455.5;
		
		//converting PTD into WCO using new keyword.Not recommended
		
		Byte b1= new Byte(b);
		System.out.println("Byte is: "+b1);
		
		//coverting PTD into WCO using valueOf(); method.
		
		Byte b2=Byte.valueOf(b);
		System.out.println("Byte is: "+b2);
		
		//converting PTD into WCO using directly autoboxing.Recommended.
		
		Byte b3=b;
		System.out.println("Byte is: "+b3);
		
		Short c1=c;
		Integer i1=i;
		Long l1=l;
		Float f1=f;
		Double d1=d;
		
		System.out.println("Short is: "+c1);
		System.out.println("Integer is: "+i1);
		System.out.println("Long is: "+l1);
		System.out.println("Float is: "+f1);
		System.out.println("Double is: "+d1);
		
		
	}

}
