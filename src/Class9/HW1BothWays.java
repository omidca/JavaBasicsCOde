package Class9;

public class HW1BothWays {

	public static void main(String[] args) {


		String[]cars= {"Porche", "Lamborghini", "Bugatti", "Mercedes", "Range Rover", "Rolls Royce"};
		 
		for(int i=0; i<cars.length; i++) {
        System.out.println(cars[i]+" ");
	}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		for(String x:cars) {
			System.out.println(x+" ");
		}
		
		
	}
}
