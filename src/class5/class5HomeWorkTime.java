package class5;

import java.util.Scanner;

public class class5HomeWorkTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Scanner input=new Scanner(System.in);
        System.out.println("Plese input your current time of 24 format");
        int hour=input.nextInt();
        if(hour>=1 && hour>=11) {
        System.out.println("It's morining");
        }else if (hour>=12 && hour<=15) {
        System.out.println("It's afternoon");	
        }else if (hour>=16 && hour<=20) {
       	System.out.println("It's evening");	
        }else if (hour>=21 && hour<=24) {
        System.out.println("It's night");
        }
        
        
		}
	}
	
		

		
		
		
		
		
		
		
		
		
		
		