
package Practicas;
    import java.util.Scanner;


public class Practica_5 {


    
    public static void main(String[] args) {
        System.out.println("entrada del dinosaurios:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nombres = input.split(" ");

        mergeSort(nombres, 0, nombres.length - 1);
        System.out.println("Dinos ordenados:");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }

    public static void mergeSort(String[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(String[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].length() <= R[j].length()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}