package com.Method;

public class PrimeVCheck {
	public static boolean prime(int n) {
		int fc=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				fc++;
			}
		}
		if(fc==2) {
			return true;
			
			}
		     else {
			 return false;
			
		}
	}


	public static void main(String[] args) {
		int m=10,n=100;
		for(int i=m; i<=n; i++) {
		if(prime(i)) {
			System.out.println(i);
		}
		

	}
	}
}
	

