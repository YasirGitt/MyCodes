package com.WrapObject;

import java.util.Scanner;

/* wap to input a character check if it is an alphabate. if it is an alphabate 
then convet in to upper case then display the next five character in circular
alphabatical list including the modifier character.*/

public class CountUp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch= sc.next().charAt(0);
		System.out.println("input: "+ch);
		if(Character.isLetter(ch)==true) {
			if(Character.isLowerCase(ch)==true) {
				ch=Character.toUpperCase(ch);
			}
			System.out.println("output: ");
			for(int i=1; i<=5; i++) {
				if(ch>'Z')
					ch='A';
				System.out.println(ch+' ');
				ch++;
			
			}
		
		}
		
	}

}


/* wap to input hrs and minuts covert hrs to minuts and min to hrs
 * wap to input a character check and display wether it is capital lettr
 *  or small letter. without using pre-defined method.
 *  wap to create a method which wil receive price and quantity of product
 *  calcutale total cost of product and give a discount of 30%
 *  if total purchase is more than 20000 otherwise give a discount of
 *  7.5% also display the total price to be pay and display all the 
 *  details inform of bill
 *  wap to define a method that we receive 3 integer and display the greatest among them
 *  by using 
 *  if else
 * or ternary operator.
 * wap to input a no and display the factorial of the no.
 * wap to count the frequency of vowel present in the string entered by the user.
 * output occurance of  a is: 3*
 * occurance of  a is: 5*
 * occurance of  a is: 3*
 * occurance of  a is: 3*
 * occurance of  a is: 0*
 * occurance of  a is: 0*/
