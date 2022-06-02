package Class10;

public class AnotherWay2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		  int[] num= {20,30,40};
		  System.out.println("Enter amount of elements in array");
		  int  size=num.length;
		  for (int i = 0; i < num.length; i++) {
	           num[i]=input.nextInt();
			if(size==num[i]) {
			   int total= 20+30+40;
			 System.out.println(total);
			}else {
				  System.out.println("Incorect input try again");
		 
	}

}
