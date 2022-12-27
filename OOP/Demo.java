package com.qspider.OOP;

public class Demo {
	
	int x;
	Demo()
	{
		x=3;
		System.out.println("Constructor Excuted :"+x);
	}
	
	void Dimma()
	{
		System.out.println("Method excuted");
	}
	
	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println("Main end");
		Demo d1= new Demo();
	    d1.Dimma();
	    new Demo().Dimma(); // that can be take as cons/method.
	    
	    
		
	}

}
