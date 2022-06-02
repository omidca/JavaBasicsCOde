
public class PrimitivesCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			/*
			* declare a variable rate.
			* If rate is more than 5 --> I am not buying a house
			*/
			double mortgageRate=4.5;

			if (mortgageRate) {

			System.out.println(“I am not buying a house”);
			}

			/*
			* declare 2 variables and check if num1 is bigger than num2
			*/
			int num1=99;
			int num2=100;

			if(num1>num2) {
			System.out.println(num1+” is bigger than “+num2);
			}

			/*
			* declare temperature,
			* if temp is higher than 75 -> i will go a walk
			*/

			int temp=89;

			if (temp) {

			//code goes inside if {}
			// when condition is true
			System.out.println(“I will go for a walk”);

			}else { //otherwise. Code comes to else {}
			//when condition is false
			System.out.println(“I am going to study Java”);
			}
	

}
