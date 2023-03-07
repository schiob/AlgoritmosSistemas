package algoritmos;
import java.util.Scanner;

/*@author cecyl*/
public class Practica5CecylGarcia {

// MergeSort Base
public static void mergeSort(String[] arr, int l, int r) {
        if (l < r) {
            int a = (l + r) / 2;
            mergeSort(arr, l, a);
            mergeSort(arr, a + 1, r);
            merge(arr, l, a, r);
        }
    }

// MergeSort Secundario
public static void merge(String[] arr, int l, int a, int r) {
        int n1 = a - l + 1;
        int n2 = r - a;
        String[] L = new String[n1];
        String[] R = new String[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[a + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (compare(L[i], R[j]) <= 0) {
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

// Comparar datos
public static int compare(String c1, String c2) {
        String values = "A23456789TJQK";
        String suits = "ECTD";
        int v1 = values.indexOf(c1.charAt(0));
        int v2 = values.indexOf(c2.charAt(0));
        if (v1 == v2) {
            int s1 = suits.indexOf(c1.charAt(1));
            int s2 = suits.indexOf(c2.charAt(1));
            return s1 - s2;
        } else {
            return v1 - v2;
        }
    }
// Main
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántas manos tienes para llenar? ");
        int n = s.nextInt();
        System.out.println("Coloca primero el número de cartas en la mano,"
                + "seguido de las cartas separadas por espacio: ");
        for (int i = 0; i < n; i++) {
            int nc = s.nextInt();
            String[] mano = new String[nc];
            for (int j = 0; j < nc; j++) {
                mano[j] = s.next(); 
            }
            mergeSort(mano, 0, mano.length - 1);
            for (String carta : mano) {
                System.out.print(carta + " ");
            }
            System.out.println();
        }
        s.close();
}
}
