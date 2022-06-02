package Class9;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] fruite= {"apple ", "orange ", "pear ", "grape ", "cherry "};
		
		for(int i=0; i<fruite.length-1; i++) {
			if(fruite[i].equalsIgnoreCase("Apple")) {
				System.out.println(fruite[i]+"is my favorite fruite ");
					
			}else {
				System.out.println(fruite[i]);
			}
			
		}}
		
}
	

