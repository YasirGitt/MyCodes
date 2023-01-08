package com.WrapObject;
/*   wap to create a method which will receive price and quantity of product
     calculate total cost of product and give a discount of 30%
     if total purchase is more than 20000 otherwise give a discount of
     7.5% also display the total price to be pay and display all the 
     details inform of bill
*/

import java.util.Scanner;

public class Retail {
	public static void shop() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter quantity");
		double quantity=sc.nextDouble();
		
		double total=price*quantity;
		
		if(total>20000) {
			double discount=total*0.3;
			long rounded=Math.round(discount);
			System.out.println("Congratulation You got 30% off");
			System.out.println("Total amount: "+total+" INR");
			System.out.println("30% discount on "+total+" INR");
			System.out.println("Discounte of: "+rounded+" INR");
			System.out.println("Total Payment is:"+(total-rounded));
		}
		else {
			double discount2=total*0.075;
			long rounded=Math.round(discount2);
			System.out.println("Congratulation You got 7.5% off");
			System.out.println("Total amount: "+total+" INR");
			System.out.println("7.5% discount on "+total+" INR");
			System.out.println("Discounte of: "+rounded+" INR");
			System.out.println("Total payment is:"+(total-rounded));
		}
		
		}
	public static void main(String[] args) {
		
		shop();
	}

}
