package class8;

import java.util.Scanner;

public class class8hwHarderOne {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item.
		 *  Every time user enters money, accumulate the amount and tell the user how much is left 
		 *  to pay off. If user give more money program should return a change. Whenever a user done
		 *   with payments program should say “Thank you for shopping!”
		 */

		double wholeAmount=0;
		Scanner input=new Scanner(System.in);
		double amountToPayOff;
		do {
			
		System.out.println("Please enter the name of the item name you want to buy");
		String itemName=input.next();
		System.out.println("Please enter the price of the item");
		double itemPrice=input.nextDouble();
		wholeAmount=wholeAmount+itemPrice;
	    System.out.println("Please enter the money");
	    double money=input.nextDouble();
	    amountToPayOff=money-wholeAmount;
	    if(amountToPayOff<0);
	    System.out.println("Amount to pay off "+(-1*amountToPayOff));
		}
	
	    while(amountToPayOff<0);
        System.out.println("Here is your change"+amountToPayOff+"Thank you for shopping!");
		
	}
}
