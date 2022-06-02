package Class6;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);
		System.out.println("Anything on sale?");
		String answer=input.next();
		System.out.println("Which item you want to buy?");
		String item=input.next();
		
		double price=552;
		double discount=0;
		double discountedPrice=0;
		
		
		if(price<20) {
			discount=10;
		}else if (price>=20&& price <100) {
			discount=20;
		}else if (price>=100 && price <=500) {
			discount=30;
			
		}else {
			discount=50;
		}
		discountedPrice=((100-discount) * price) /100;
		discountedPrice=Math.round(discountedPrice * 100.0) / 100.0;
		System.out.println("After the discount of "+discount+"%"+" the item price is reduced from $"+price+" to $ "+discountedPrice);
		
		
	}
	
		
		

	}


