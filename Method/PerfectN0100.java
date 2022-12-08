package com.Method;

public class PerfectN0100 {
	public static boolean perf(int n) {
		
		int sum=0,temp=n;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum+i;
		}
			}
	if(sum==n) {
		return true;
	}
	else {
		return false;

	}
}
	
	public static void main ( String []args) {
		int m=10,n=10000;
		for( int i=m; i<=n; i++) {
			if(perf(i)) {
				System.out.println("Perfect no is: "+i);
	
			}
		}
	
	}
}

