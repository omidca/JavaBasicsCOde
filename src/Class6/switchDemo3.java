package Class6;

import java.util.Scanner;

public class switchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("please tell me where are you from");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Mexico":
			favoriteFood="tacos";
	        break;
		case"Canada":
			favoriteFood="poutine";
			break;
		case"Turkey":
			favoriteFood="lahmocun";
			break;
		case"Egypt":
			favoriteFood="ghorma";
			break;
	    default:
	    	favoriteFood="Unknown";
	    		
		}
		System.out.println("You are from"+country+" and favorite Food is "+favoriteFood);
	}

}
