package formeonly;

public class PrintCertainNumbers {

	public static void main(String[] args) {
		
		// from 1 to 30, print only 8, 11, 15, 29.

		for(int x=1; x<=30; x++) {
			if(x==8 || x==11 || x==15 || x==29) {
				System.out.print(x);
			}
		
		}
	}

}
