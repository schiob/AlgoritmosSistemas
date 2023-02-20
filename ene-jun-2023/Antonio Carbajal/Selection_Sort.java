package Semestre1;

import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del arreglo: ");
		int n = s.nextInt();

		int[] arr = new int[n];

		System.out.println("Ingrese los datos del arreglo: ");
		for (int x = 0; x < arr.length; x++) {
			arr[x] = s.nextInt();
		}

		System.out.println("Arreglo Original:" + Arrays.toString(arr));

		int min = 0;
		for (int i = 0; i < arr.length; i++) {

			min = i;

			for (int j = i+1; j < arr.length; j++) {
					
					if(arr[j]>arr[min]) {
						
						min=j;
						
					}
			}
			
			if(min!=i) {
				int aux= arr[i];
				arr[i]=arr[min];
				arr[min]=aux;
			}

		}
		System.out.println("Arreglo Ordenado:" + Arrays.toString(arr));

	}
}
