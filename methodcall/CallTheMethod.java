package com.methodcall;
import com.Method.*;
public class CallTheMethod {
	public static void dur() {
		System.out.println("Inter change not allowed");
	}
	public static void main(String[] args) {
		
		dur();
		
		Addition.add(3,4);
		AdditionScnr.add(23, 45);
		
		
		
	}

}
