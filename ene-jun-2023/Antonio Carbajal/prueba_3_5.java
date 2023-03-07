package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class prueba_3_5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del arreglo: ");
		int n = Integer.parseInt(s.nextLine());

		String[] arr = new String[n];

		System.out.println("Ingrese los datos del arreglo: ");
		for (int x = 0; x < arr.length; x++) {
			arr[x] = s.nextLine();
		}

		System.out.println("Arreglo Original:" + Arrays.toString(arr));

		int min = 0;
		for (int i = 0; i < arr.length; i++) {

			min = i;

			for (int j = i+1; j < arr.length; j++) {
					
					if(arr[j].length()>arr[min].length()) {
						
						min=j;
						
					}
			}
			
			if(min!=i) {
				String aux= arr[i];
				arr[i]=arr[min];
				arr[min]=aux;
			}

		}
		System.out.println("Arreglo Ordenado:" + Arrays.toString(arr));

	}
}
