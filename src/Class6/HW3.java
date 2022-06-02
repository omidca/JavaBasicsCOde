package Class6;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);
		System.out.println("Calculator");
		int No1=input.nextInt();
		int No2=input.nextInt();
		char ar=input.next().charAt(0);
		
		int Na=888;
		if (ar=='/') {
			Na=(No1/No2);}
		else if (ar=='*') {
			Na=(No1*No2);
		}else if(ar=='+') {
			Na=(No1+No2);
		}else if (ar=='-') {
			Na=(No1-No2);}
		System.out.println("The result is "+Na);
		

	}

}
