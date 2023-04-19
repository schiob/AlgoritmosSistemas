package U2;

/**
 *
 * @author Cancino
 */
import java.util.*;

public class Practica_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        String[] medicinas = sc.nextLine().split(" ");
        quickSort(medicinas, 0, n - 1);
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String medicina = sc.nextLine();
            System.out.println(binarySearch(medicinas, medicina));
        }
    }

    public static void quickSort(String[] arr, int izq, int der) {
        if (izq < der) {
            int indiceParticion = particion(arr, izq, der);
            quickSort(arr, izq, indiceParticion - 1);
            quickSort(arr, indiceParticion + 1, der);
        }
    }

    public static int particion(String[] arr, int izq, int der) {
        String pivote = arr[der];
        int i = izq - 1;
        for (int j = izq; j < der; j++) {
            if (arr[j].compareTo(pivote) < 0) {
                i++;
                Switch(arr, i, j);
            }
        }
        Switch(arr, i + 1, der);
        return i + 1;
    }

    public static void Switch(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int binarySearch(String[] arr, String x) {
        int izq = 0, der = arr.length - 1;
        while (izq <= der) {
            int mitad = (izq + der) / 2;
            if (arr[mitad].equals(x)) {
                return mitad;
            } else if (arr[mitad].compareTo(x) < 0) {
                izq = mitad + 1;
            } else {
                der = mitad - 1;
            }
        }
        return -1; 
    }
}
