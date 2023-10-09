
package Parcial1;
import java.util.Scanner;

public class PalabrasOrdenadas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // numero de palabras
        System.out.println("Ingresa numero de palabras:");
        int n = s.nextInt();
        s.nextLine();

        // palabras divididas por espacio y almacenadas en el arreglo
        System.out.println("Ingresa las palabras separadas por un espacio:");
        String[] palabras = s.nextLine().split(" ");

        // Ordenar las palabras alfabéticamente utilizando Insertion Sort
        insertionSort(palabras);

        // imprimir losta ordenada
        System.out.println("Palabras Ordenadas alfabeticamente");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
        s.close();
    }

    public static void insertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }
}
