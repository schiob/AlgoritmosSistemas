package Examen2;

import java.util.Scanner;

public class Examen2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer N y Q
        int N = sc.nextInt();
        int Q = sc.nextInt();

        // Leer las canciones
        String[] canciones = new String[N];
        for (int i = 0; i < N; i++) {
            canciones[i] = sc.next();
        }

        // Ordenar las canciones
        quickSort(canciones, 0, N - 1);

        // Buscar las canciones solicitadas
        for (int i = 0; i < Q; i++) {
            String cancionBuscada = sc.next();
            int pos = binarySearch(canciones, cancionBuscada);
            System.out.println(pos);
        }

        // Imprimir el nuevo orden de la playlist
        for (String cancion : canciones) {
            System.out.print(cancion + " ");
        }
    }

    public static void quickSort(String[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        int pivot = (inicio + fin) / 2;
        pivot = partition(arr, inicio, fin, pivot);

        quickSort(arr, inicio, pivot - 1);
        quickSort(arr, pivot + 1, fin);
    }

    public static int partition(String[] arr, int inicio, int fin, int pivot) {
        String valorPivot = arr[pivot];
        swap(arr, pivot, fin);

        int pos = inicio;
        for (int i = inicio; i < fin; i++) {
            if (arr[i].compareTo(valorPivot) < 0) {
                swap(arr, i, pos);
                pos++;
            }
        }
        swap(arr, pos, fin);
        return pos;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int binarySearch(String[] arr, String elem) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;

            if (arr[mitad].equals(elem)) {
                return mitad;
            }

            if (arr[mitad].compareTo(elem) > 0) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }

        return -1;
    }
}
