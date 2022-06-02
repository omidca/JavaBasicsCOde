package Class6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String country,language;
		
		System.out.println(" What country are you from");
		
		language=input.next();
		
		switch (language) {
		case "Badbakhtistan":
			language="Farsi";
			break;
		case "France":
		language="French";
		break;
		case "Turkey":
			language="Turkish";
			break;
			default:
				language="Invalid";
			
		}
	System.out.println("the user speaks "+language);
		
		

	}

}
