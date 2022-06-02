package class8;

import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Find my secret number when to use while do.
		 
		int secretNum = 1;
		int guessedNum;
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Gues my secret number ");
		guessedNum = scan.nextInt();
		}while(guessedNum != secretNum);	
		System.out.println("You got it");
		scan.close();
	}

}
