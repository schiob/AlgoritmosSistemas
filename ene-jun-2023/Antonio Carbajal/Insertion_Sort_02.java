package Semestre1;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort_02 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del Arreglo.");
		int e = Integer.parseInt(s.nextLine()); 

		String[] Arreglo = new String[e];

		System.out.println("Ingrese los datos del arreglo:");
		for (int x = 0; x < Arreglo.length; x++) {
			Arreglo[x] = s.nextLine();
		}

		System.out.println("Arreglo Original:" + Arrays.toString(Arreglo));

		for (int i = 0; i < Arreglo.length; i++) {
			String temp = Arreglo[i];
			int j = i - 1;
			while (j >= 0 && temp.length()<Arreglo[j].length() ) {
				Arreglo[j + 1] = Arreglo[j];
				j = j - 1;
			}
			Arreglo[j + 1] = temp;
		}

		System.out.println("Arreglo Ordenado:" + Arrays.toString(Arreglo));
	}

}
