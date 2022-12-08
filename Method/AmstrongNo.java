package com.Method;

public class AmstrongNo {

	public static boolean amst(int n) {
		
			    int sum=0,c=0,t=n;
				while(n!=0) {
					c++;
					n=n/10;
				}
				n=t;
			while(n!=0) {
				int r=n%10;
				int pow=1;
				for (int i=1; i<=c; i++) {
					pow=pow*r;
				}
				sum=sum+pow;
				n=n/10;
			}
			if(sum==t) {
				return true;
				}
			else {
				return false;
			}

		}
public static void main (String []args) {
	
   int m=10, n=100000;
	for(int i=m; i<=n; i++) {

		if(amst(i)) {
			System.out.println("Amstrong no is : "+i);

		}
	}
}
}
