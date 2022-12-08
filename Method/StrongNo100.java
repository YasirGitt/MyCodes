package com.Method;

public class StrongNo100 {
	public static boolean str(int n) {

		int sum=0,temp=n;
		do {
			int digit=n%10;
			int fact=1;
			for(int i=1; i<=digit; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		while(n!=0);
		if(sum==temp) {
			return true;
			}
		else {
			return false;
		}

	}

public static void main ( String []args) {
	int m=10,n=100000;
	for ( int i=m; i<=n; i++) {
		if(str(i)) {
			System.out.println("Strong no is: "+i);
		}
	}
}
}

