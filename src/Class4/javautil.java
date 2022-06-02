package Class4;

import java.util.Scanner;

public class javautil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        
		System.out.println(" Enter you number");
		int number1 = scan.nextInt();
		
		System.out.println("Please enter number2 ");
		int number2 = scan.nextInt();
		
		if (number1>number2) {
			System.out.println(number1+" is larger than "+number2);
			
		}else {
			System.out.println(number2+" is larger than"+number2);
			
		}
	}

}
