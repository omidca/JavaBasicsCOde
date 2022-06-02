package reviewForClass5And6;

import java.util.Scanner;

public class secret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int secretNumber=1;
       int guesNumber;
       Scanner scan= new Scanner(System.in);
       
       do {
    	   System.out.println("Gues my number");
    	   guesNumber=scan.nextInt();
    	   
       }while(guesNumber !=secretNumber);
       System.out.println("You got it");
       
	}

}
