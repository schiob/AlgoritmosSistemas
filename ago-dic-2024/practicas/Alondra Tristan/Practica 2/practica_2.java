package practicas;
import java.util.Scanner;

public class practica_2 {

	public static void main(String[] args) {
		
		int n= 10;
		int m = 5;

		System.out.println(n + " " + m);
		  
		int ni[] = {1, 3, 1, 10, 8, 4, 5, 6, 9, 5};
   
	    for (int i = 0; i < ni.length; i++) {
	    	System.out.print(ni[i] + " ");  
	    }
	        
	    System.out.println();
	    
	    //Insertion sort
	    for (int i = 1; i < ni.length; i++) {
            int elem_actual = ni[i]; 
            int j = i - 1;

            while (j >= 0 && ni[j] > elem_actual) {
                ni[j + 1] = ni[j];  
                j--;
            }
            ni[j + 1] = elem_actual;   
        }
	    
	    int tiempo = 0;
        int problemasResueltos = 0;

        for (int i = 0; i < n; i++) {
            if (tiempo + ni[i] <= m) {
                tiempo += ni[i];
                problemasResueltos++;
            } else {
                break;  
            }
        }
        
        System.out.print(problemasResueltos);
	    
	}//end main

}//end class