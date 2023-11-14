package Stack;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int tamaño = entrada.nextInt();
		String arreglo [] = new String [tamaño];
		entrada.nextLine();
		String cadena = entrada.nextLine();
		arreglo = cadena.split("\\s+");
		
		int arregloEnt [] = new int [tamaño];
		
		
		for (int i = 0; i < tamaño; i++) {
			arregloEnt [i] = Integer.parseInt(arreglo[i]);
		}
		
		Ejercicio2 objt = new Ejercicio2();
        objt.countSort(arregloEnt,tamaño);
  
        for (int i: arregloEnt) {
        	System.out.print(i + " ");
        }
        System.out.println();

	}
	
	void countSort(int array[], int size) {
	    int[] output = new int[size + 1];

	    int max = array[0];
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max)
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    for (int i = 0; i < max; ++i) {
	      count[i] = 0;
	    }

	    for (int i = 0; i < size; i++) {
	      count[array[i]]++;
	    }


	    for (int i = 1; i <= max; i++) {
	      count[i] += count[i - 1];
	    }

	    for (int i = size - 1; i >= 0; i--) {
	      output[count[array[i]] - 1] = array[i];
	      count[array[i]]--;
	    }

	    for (int i = 0; i < size; i++) {
	      array[i] = output[i];
	    }
	  }

}
