package class7;

public class WhileLoop {

	public static void main(String[] args) {

		int x=10;
		
		x=x+1;
		x+=1; // shorter way of x=x+1
		System.out.println(x);
		 x++; // increments of value of a variable by 1
		 System.out.println(x);
		 
		 x--;  // decrement ...
		 System.out.println(x);
		 // increments and decrements only work with variables, not values exp: not 10++;
		 
		 int num=100;
		 num++;
		 System.out.println(num);
		 
		 //while:
		 int time=10;
		
		 if(time<10) {
			 System.out.println("Morning");	 
		 }
			while(time<12) {
				System.out.println("Morning");
				time++;
			}
			
			
	}

}
