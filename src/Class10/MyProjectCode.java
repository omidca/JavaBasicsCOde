package Class10;

public class MyProjectCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numbers= {5,12,450,2200,2,99,6,1200,8,0};
		int max=numbers[0];
		int min=numbers[0];
		
		for(int number:numbers) {
			if(max<number)max=number;
			if(min>number)min=number;
		}
		System.out.println("Max numbers is:"+max);
		System.out.println("Min numbers is:"+min);
	}
}
