package class5;

public class LogicallOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean job=true;
		double salary =100000;
		
		if (job && salary>100000) {
			System.out.println("I'm supper happy");
			
		}
		
		System.out.println("------------------------");
		boolean study=false;
		boolean homework=false;
		boolean practice=false;
		if(study && homework && practice) {
			System.out.println(" you will succeed in the course");
		}else {
			System.out.println(" you wont");
		}
				
	}

}
