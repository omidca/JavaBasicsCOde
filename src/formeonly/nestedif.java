package formeonly;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int creditScore =790;
		int age =18;
		int cashInHand =2500;
		
		if(creditScore>=700) {
			if(age>=18) {
				if(cashInHand>=2000) {
			System.out.println("Let me bring the car for you.");
			
		}else {
			System.out.println("Sorry we need down payment of at least $2000");
		}
			
		}else {
			System.out.println("you are too young");
		}
		
	}else {
			System.out.println("Your credit is poor.");
			
			
		}
		
		}
	}


