package algoritmos;
import java.util.Scanner;
/**
 * Fecha: 6 de marzo de 2023
 * @author Luz Andrea
 * MERGE SORT
 */
public class Practica5 {

public static void mergeSort(String[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
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
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
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

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // número de manos de cartas
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt(); // número de cartas en la mano
            String[] hand = new String[h];
            for (int j = 0; j < h; j++) {
                hand[j] = sc.next(); 
            }
            mergeSort(hand, 0, hand.length - 1);
            for (String card : hand) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
        sc.close();
}
}

