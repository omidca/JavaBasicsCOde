package formeonly;

public class PrintOddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=20; i++) {
			if(i==8 || i==11 || i==15 || i==19) {
				continue;
				
			}
			System.out.print(i);
		}
		
	}

}
