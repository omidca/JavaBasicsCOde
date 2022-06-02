package Class6;

import java.util.Scanner;

public class class6hw {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	    if (num>0){
	    System.out.println(num+" is  positive"); 
	      
	      }if (num<0){
	      System.out.println(num+" is Negative "); 
	        
	      }else if (num==0){
	      
	      System.out.println("Entered number is equal to 0"+num);
	    }
	}

}
