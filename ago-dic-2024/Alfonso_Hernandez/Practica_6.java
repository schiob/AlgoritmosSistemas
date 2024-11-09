package algoritmos;

import java.util.Scanner;

public class Practica_6{

    // Función de Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Función para dividir el arreglo y encontrar el índice del pivote
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Coloca el pivote en su lugar correcto
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de entrada
        int n = scanner.nextInt();
        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        // Ordenamiento con Quick Sort
        quickSort(colors, 0, n - 1);

        // Impresión del resultado
        for (int i = 0; i < n; i++) {
            System.out.print(colors[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}

