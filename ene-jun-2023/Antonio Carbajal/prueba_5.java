package Pruebas;

import java.util.*;

public class prueba_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nombres = new String[n];
		int[][] medallas = new int[n][3];
		for (int i = 0; i < n; i++) {
			nombres[i] = sc.next();
			medallas[i][0] = sc.nextInt(); // oro
			medallas[i][1] = sc.nextInt(); // plata
			medallas[i][2] = sc.nextInt(); // bronce
		}
		quicksort(nombres, medallas, 0, n - 1);
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
	}

	public static void quicksort(String[] nombres, int[][] medallas, int inicio, int fin) {

		if (inicio < fin) {

			int INpivote = particion(nombres, medallas, inicio, fin);
			quicksort(nombres, medallas, inicio, INpivote - 1);
			quicksort(nombres, medallas, INpivote + 1, fin);

		}

	}

	public static int particion(String[] nombres, int[][] medallas, int inicio, int fin) {

		int[] pivote = medallas[inicio];
		String Nombrepivote = nombres[inicio];
		int i = inicio + 1;
		int j = fin;
		while (i <= j) {
			while (i <= j && comparar(medallas[i], nombres[i], pivote, Nombrepivote) < 0) {
				i++;

			}
			while (i <= j && comparar(medallas[j], nombres[j], pivote, Nombrepivote) > 0) {
				j--;

			}
			if (i <= j) {

				intercambiar(nombres, medallas, i, j);
				i++;
				j--;

			}
		}
		intercambiar(nombres, medallas, inicio, j);
		return j;
	}

	public static void intercambiar(String[] nombres, int[][] medallas, int i, int j) {

		String Tempnombre = nombres[i];
		nombres[i] = nombres[j];
		nombres[j] = Tempnombre;
		int[] Tempmedallas = medallas[i];
		medallas[i] = medallas[j];
		medallas[j] = Tempmedallas;
	}

	public static int comparar(int[] medallas1, String nombre1, int[] medallas2, String nombre2) {

		if (medallas1[0] > medallas2[0]) {
			return 1;
		} else if (medallas1[0] < medallas2[0]) {
			return -1;
		} else { // misma cantidad de oro
			if (medallas1[1] > medallas2[1]) {
				return 1;
			} else if (medallas1[1] < medallas2[1]) {
				return -1;
			} else { // misma cantidad de plata
				if (medallas1[2] > medallas2[2]) {
					return 1;
				} else if (medallas1[2] < medallas2[2]) {
					return -1;
				} else { // misma cantidad de bronce
					return nombre1.compareToIgnoreCase(nombre2);
				}
			}
		}
	}
}
