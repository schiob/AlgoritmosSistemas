package algoritmos;
import java.util.Scanner;

public class Practica_4 {
    
    // Método principal para ordenar la lista usando Merge Sort
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Divide la lista en dos mitades
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Fusiona las dos mitades
            merge(arr, left, mid, right);
        }
    }

    // Método para fusionar dos mitades
    public static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Arrays temporales para almacenar las dos mitades
        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        // Copia los datos a los arrays temporales
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        // Índices iniciales de las dos mitades y del array fusionado
        int i = 0, j = 0, k = left;

        // Ordena y fusiona los dos arrays temporales en el array original
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

        // Copia los elementos restantes de leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Número de palabras
        sc.nextLine(); // Consumir la línea sobrante
        String[] words = sc.nextLine().split(" "); // Lista de palabras

        // Llama al método mergeSort para ordenar la lista
        mergeSort(words, 0, words.length - 1);

        // Imprime las palabras ordenadas
        for (String word : words) {
            System.out.print(word + " ");
        }
        sc.close();
    }
}


