package class8;

import java.util.Scanner;

public class scannerAndWhileLoop {

	public static void main(String[] args) {
		// take the input form the user using scanner
		//increment it by 2 print it
		//if value is 10 terminate the program
		int x=0;
		Scanner scan=new Scanner(System.in);
		
		
		while(x!=10) {
			System.out.println("Please enter the number");
		x=scan.nextInt();
		System.out.println(x+2);
		}

		scan.close();
		
		
	}

}
