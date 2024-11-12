package primerParcial;
import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de medicinas que tiene "));
		String [] arr = new String[n];
		
		Scanner lee = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("Digite el nombre de la medicina "+i+": ");
			arr[i] = lee.next();
		}

		System.out.println("\nElementos inicial");
		for(String ele: arr) {
			System.out.print(ele+" ");
		}
		
		
		for (int i = 1; i < arr.length; i++) {
           		 String aux = arr[i];
         		   int j = i - 1;

       		     while (j >= 0 && arr[j].compareTo(aux) > 0) {
            		    arr[j + 1] = arr[j];
			    j--;
          		  }
			arr[j + 1] = aux;
     		  
		}
		System.out.println("\nElementos acomodados alfabeticamente");
		for(String ele: arr) {
			System.out.print(ele+" ");
		}
	}

}
		
			
		    
		     

