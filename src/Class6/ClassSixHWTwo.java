package Class6;

import java.util.Scanner;

public class ClassSixHWTwo {

	public static void main(String[] args) {
	
		Scanner input=new Scanner (System.in);
		System.out.println("Enter Grade");
		char Grade=input.next().charAt(0);
		String explanation;
		
		switch(Grade) {
		
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Avrage";
			break;
		case 'D':
			explanation="Bad";
			break;
			default:
				explanation="Not Acceptable";
			}
		
		System.out.println("Your grade is "+explanation);	
		
		

	}

}
