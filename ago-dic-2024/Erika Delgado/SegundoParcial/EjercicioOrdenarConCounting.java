package Parcial2;

import java.util.Scanner;

public class EjercicioOrdenarConCounting {
	
	public static int[] countSort(int[] arr) {
		if (arr == null || arr.length == 0) return arr; 
        
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

       
        int[] count = new int[max - min + 1];  
        int[] output = new int[arr.length];

        
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;  
        }

        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        return output;
	}

    public static void main(String[] args) {
    	
    	int n;
    	
    	Scanner lee = new Scanner(System.in);
    	
    	System.out.println("Digite el tamaño de numeros y luego los valores");
    	n = lee.nextInt();
    	
        int[] numeros = new int[n];
        
        for(int i = 0 ; i<n; i++) {
        	numeros[i] = lee.nextInt();
        }
        
        // Mostrar arreglo
        System.out.println("Arreglo desordenado:");
        for (int num : numeros) {
            System.out.print(num + "  ");
        }
        
        // Llamar a countSort
        int[] arreglo = countSort(numeros);
        
        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + "  ");
        }
        
    }

}
