package Class9;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] disney= {"Shrek ", "Elsa ", "Goofy ", "Mulan ", "Tom&Jerry "};
		
		System.out.println(disney[0]);
		
		System.out.println("==================");
		// to get all elements from an array
		
		for (int i=0; i<disney.length; i++) {
			System.out.print(disney[i]);
		}
		System.out.println("All elements using regular for loop------------------------");
		for(String character:disney) {
			if(character.equalsIgnoreCase("Mulan")) {
			System.out.println(character+" is my favorite character");
			
			}else {
				System.out.println(character+" ");
			}
			
		}
	}
}
