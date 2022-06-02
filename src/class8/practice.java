package class8;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
System.out.println("===========================================");

        for (int a=100; a>=1; a--) {
        	System.out.print(a+" ");
        }
        System.out.println("========================");
        
     
        
        for (int a=20; a>=1; a-=2) {
        	System.out.print(a+" ");
        }
        System.out.println("==============");
        // print odd numbers between 20 and 50 (2 way)
        for (int c=21; c<=50; c+=2) { 
        	System.out.print(c+" ");
        }
        System.out.println("================");
        for (int d=31; d<50; d++) {
        	if (d % 2  != 0) {
        		System.out.print(d+" ");
        	}
        }
	}

}
