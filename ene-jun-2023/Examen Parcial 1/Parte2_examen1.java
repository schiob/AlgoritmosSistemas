package U1;

import java.util.Scanner;

/**
 *
 * @author Cancino
 */
public class Parte2_examen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Peliculas: ");
        int Ta = sc.nextInt();
        String[][] matriz = new String[Ta][3];
        for (int i = 0; i < Ta; i++) {
            matriz[i][0] = sc.next();
            matriz[i][1] = sc.next();
            matriz[i][2] = sc.next();
        }
        mergeSort(matriz, 0, Ta - 1);
        printMatriz(matriz, Ta);
    }

    private static void mergeSort(String[][] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(String[][] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        String[][] L = new String[n1][3];
        String[][] R = new String[n2][3];
        for (int i = 0; i < n1; i++) {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
            L[i][2] = arr[l + i][2];
        }
        for (int j = 0; j < n2; j++) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
            R[j][2] = arr[m + 1 + j][2];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            int h1 = Integer.parseInt(L[i][1]);
            int m1 = Integer.parseInt(L[i][2]);
            int h2 = Integer.parseInt(R[j][1]);
            int m2 = Integer.parseInt(R[j][2]);
            if (h1 < h2 || (h1 == h2 && m1 < m2)) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                arr[k][2] = L[i][2];
                i++;
            } else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                arr[k][2] = R[j][2];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            arr[k][2] = L[i][2];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            arr[k][2] = R[j][2];
            j++;
            k++;
        }
    }

    public static void printMatriz(String[][] matriz, int Ta) {
        for (int i = 0; i < Ta; i++) {
            System.out.print(matriz[i][0] + " ");
        }
    }

}
