package class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String answer = input.next();
		if (answer.equals("no")) {
			System.out.println("You will be offered a credit card");
		} else {
			System.out.println("What is the balance?");
			int balance = input.nextInt();
			if (balance > 800) {
				System.out.println("Pay off immediately");
			} else {
				System.out.println("You can spend more");
	}
		
		}	
	}
}

