import java.util.*;

import javax.swing.JOptionPane;
public class p1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int [] j = new int [5];
		int [] f = new int [5];
		int a=0; 
		int b=0;
	List<Integer> derf= new ArrayList(Arrays.asList(3,43,2,5,4,334,45,23,123,323, 45,34,23,43,5,46,78));

	for (int i=0; i<derf.size(); i++) {
		if ( derf.get(i) % 2 == 1 ) {
			derf.remove(i);
		}
	
}
	
	for(int i=derf.size()-1; i>=0; i--) {
		System.out.print(derf.get(i)+" , ");
	}
}
}
		



