package class8;

public class BreakKeywords {

	public static void main(String[] args) {
		
		// In this case, it loops 5 time.

		for (int i=1; i<=5; i++) {
			System.out.print("Hello");
		}
		
		// If we add break, it loops only one time
		
		System.out.print("==========");
		for(int i=1; i<=6; i++) {
			System.out.println("Hi");
			break;
		}
		
	}

}
