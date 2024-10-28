package Extra_Orde;

import java.util.*;

public class Extra_Orde {
    public static void main(String[] args) {
        //n y m representan la cantidad de libros y la cantidad de búsquedas a realizar, respectivamente.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer m

        String[][] books = new String[n][2];

        for (int i = 0; i < n; i++) {
            String book = scanner.next();
            int pages = scanner.nextInt();
            books[i][0] = book;
            books[i][1] = Integer.toString(pages);
        }

        quicksort(books, 0, n - 1);

        // Imprimir la lista ordenada de libros
        for (int i = 0; i < n; i++) {
            System.out.print(books[i][0] + " ");
        }
        System.out.println();

        // Realizar las búsquedas y mostrar los resultados
        for (int i = 0; i < m; i++) {
            String searchBook = scanner.next().trim();
            int position = busquedaBinaria(books, searchBook);
            System.out.println(position);
        }

        scanner.close();
    }

    static int partition(String[][] arr, int low, int high) {
        int i = low - 1;
        int pivot = Integer.parseInt(arr[high][1]);

        for (int j = low; j < high; j++) {
            if (Integer.parseInt(arr[j][1]) <= pivot) {
                i++;
                String[] temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String[] temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quicksort(String[][] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    static int busquedaBinaria(String[][] arr, String target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid][0].equals(target)) {
                return mid;
            } else if (arr[mid][0].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}