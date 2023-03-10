package U1;

import java.util.*;

/**
 *
 * @author Cancino
 */
public class Practica_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las manos:");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("cuantas cartas tiene la mano:");
            int n = sc.nextInt();
            String[] cards = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("ingres la carta:");
                cards[i] = sc.next();
            }
            mergeSort(cards, 0, n - 1);
            for (String card : cards) {
                System.out.print(card + " ");
            }
            System.out.println();
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
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (compareCards(L[i], R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static int compareCards(String c1, String c2) {
        if (getValue(c1) < getValue(c2)) {
            return -1;
        } else if (getValue(c1) > getValue(c2)) {
            return 1;
        } else {
            return getSuit(c1).compareTo(getSuit(c2));
        }
    }

    public static int getValue(String card) {
        char c = card.charAt(0);
        if (c >= '2' && c <= '9') {
            return c - '0';
        } else if (c == 'A') {
            return 1;
        } else if (c == 'T') {
            return 10;
        } else if (c == 'J') {
            return 11;
        } else if (c == 'Q') {
            return 12;
        } else if (c == 'K') {
            return 13;
        } else {
            return 14;
        }
    }

    public static String getSuit(String card) {
        return card.charAt(1) + "";
    }
}
