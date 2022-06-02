package class7;

public class WhileLoopExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print numbers from 1 to 10
		
		int num=1;
		while(num<=10) {
			
		System.out.print(num+" ");	
		num++;
		}
		System.out.println();
		
		int num1=0;
		while(num1<0) {
			num1++;
			System.out.print(num1+" ");
		}
		System.out.println();
		// number from 10 to 100
		int a=10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		
		// numbers from 10 to 1
		int b=10;
		while(b>=1) {
			System.out.println(b+" ");
			b--;
		}
		int c=100;
		while(c>=50) {
			System.out.print(c+" ");
			c--;
		}
	}

}
