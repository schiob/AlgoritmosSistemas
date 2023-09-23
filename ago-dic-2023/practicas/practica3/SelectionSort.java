
import java.util.Scanner;


public class SelectionSort {
	
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int arreglo [] = {5,22,11,45,43,18,16,15,28,42,42,15,49,27};
		int menor, aux, pos = 0;
		
		for (int i = 0; i < arreglo.length; i++){
			menor = arreglo[i];
			for (int j = i; j < arreglo.length; j ++) {
					if (arreglo[j] < menor) {
						menor = arreglo[j];
						pos = j;
					}
				}
			aux = arreglo [i];
			arreglo[i] = menor;
			arreglo [pos] = aux;
			
			}
		
		for (int i= 0; i < arreglo.length; i++) {
			
			System.out.println(arreglo [i]);
			
		}
		
		
	}

}
