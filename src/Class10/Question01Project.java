package Class10;

import java.util.Scanner;

public class Question01Project {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Numbers to enter");
		
		int size = scan.nextInt();
		int [] numbers = new int[size];
		for(int x = 0; x<size; x++) {
			System.out.println("Please enter the number");
			numbers[x]=scan.nextInt();
			sum+=numbers[x];
		}
		System.out.println("Sum of "+size+"numbers are= "+sum);

	}

}
