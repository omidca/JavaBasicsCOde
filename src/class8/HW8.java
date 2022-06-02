package class8;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
	
		/*
		 * Write a program that reads a range of integers (start and end point), provided by a user and then from that range
		 *  prints the sum of the even and odd integers.
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int n1=inp.nextInt();
		int n2=inp.nextInt();
		
		System.out.println();
		System.out.println("sum of even n");
		System.out.println();
		
		int sum1=0;
		
		for(int i=1; i<=6; i++) {
			if(i % 2 == 0) {
				sum1+=i;
			}
				
			}
			System.out.println("sum of even number is "+sum1);
			
			//sum of odd numbers
			int sum2=0;
			for(int i=1; i<=6; i++) {
				if (i % 2 !=0) {
					sum2 +=i;
					
				}
			}
			System.out.println("sum of odd numbers is "+sum2);
		}
		
	
		

	}


