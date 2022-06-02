package Class9;

public class hw2BothWays {

	public static void main(String[] args) {


		String[]animals= {"dog", "cat", "horse", "parakeet", "donkey"};
		 
		for(int i=0; i<animals.length; i++) {
        System.out.println(animals[i]+" ");
	}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		for(String x:animals) {
			System.out.println(x+" ");
		}
		

	}

}
