package com.WrapObject;

import java.util.Scanner;

import com.qsp.InheritancePrograms.MainC;

/* wap to count the frequency of vowel present in the string entered by the user.
* output occurrence of  a is: 3*
* Occurrence of  a is: 5*
* Occurrence of  a is: 3*
* Occurrence of  a is: 3*
* Occurrence of  a is: 0*
* Occurrence of  a is: 0*/

public class Frequency {
	public void freq(String str) {
		int ecount=0,acount=0,icount=0,ocount=0,ucount=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='A') {
				acount++;
				
			}
			else if(ch=='e'||ch=='E') {
				ecount++;
			
		}
			else if(ch=='i'||ch=='I') {
				icount++;
			
			}
			else if(ch=='o'||ch=='O') {
				ocount++;
			
			}
			else if(ch=='u'||ch=='U') {
				ucount++;
			
			}
		
			}
		System.out.println("occerence of a is: "+acount);
		System.out.println("occerence of e is: "+ecount);
		System.out.println("occerence of i is: "+icount);
		System.out.println("occerence of o is: "+ocount);
		System.out.println("occerence of u is: "+ucount);
		}
	
		public static void main (String []args) {
			Frequency f= new Frequency();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter string");
			String str=sc.nextLine();
			f.freq(str);
		}

}
