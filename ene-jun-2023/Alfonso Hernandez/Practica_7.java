package Algoritmos_Ordenamiento_Busqueda;

import java.util.*;

public class Practica_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // número de medicinas
        int q = sc.nextInt(); // número de peticiones

        // Leer los nombres de las medicinas
        String[] medicinas = new String[n];
        for (int i = 0; i < n; i++) {
            medicinas[i] = sc.next();
        }

        // Ordenar el arreglo de medicinas usando quicksort
        quicksort(medicinas, 0, n - 1);

        // Para cada petición, buscar el nombre de la medicina usando binary search
        for (int i = 0; i < q; i++) {
            String nombreMedicina = sc.next();
            int posicion = binarySearch(medicinas, nombreMedicina);
            System.out.println(posicion);
        }
    }

    // Algoritmo quicksort para ordenar un arreglo de strings
    public static void quicksort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    // Algoritmo partition para quicksort
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Algoritmo binary search para buscar un string en un arreglo ordenado
    public static int binarySearch(String[] arr, String x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].equals(x)) {
                return mid;
            } else if (arr[mid].compareTo(x) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
