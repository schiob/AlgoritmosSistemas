package practicas;
import java.util.Scanner;

public class OrdenarPalabrasMergeSort {
	
	public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Ordenar la primera y segunda mitad
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Combinar las mitades ordenadas
            merge(arr, left, middle, right);
        }
    }

    public static void merge(String[] arr, int left, int middle, int right) {
        // Tamaños de los subarrays temporales
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Crear arrays temporales
        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        // Copiar los datos a los arrays temporales
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // Combinar los arrays temporales

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de leftArray, si quedan
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray, si quedan
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Introduzca el numero y las palabras: ");
        // Leer el número de palabras
        int n = Integer.parseInt(scanner.nextLine());

        // Leer las palabras y almacenarlas en un array
        String[] palabras = scanner.nextLine().split(" ");

        // Ordenar las palabras usando Merge Sort
        mergeSort(palabras, 0, palabras.length - 1);

        System.out.print("Palabras ordenadas: ");
        // Imprimir las palabras ordenadas
        System.out.println(String.join(" ", palabras));

        scanner.close();

	}

}