package Practicas;

import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de colores e ingresar los colores: ");
        int num = sc.nextInt();
        int[] colores = new int[num];
        
        for (int i = 0; i < colores.length; i++) {
            colores[i] = sc.nextInt();
        }
        
        System.out.println("--------COLORES ORDENADOS-------");

        quickSort(colores, 0, colores.length - 1);

        for (int i : colores) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivoteIdx = start;
        int compIdx = end;

        while (pivoteIdx != compIdx) {
            if (pivoteIdx < compIdx) {
                if (arr[compIdx] >= arr[pivoteIdx]) {
                    compIdx--;
                } else {
                    int temp = arr[pivoteIdx];
                    arr[pivoteIdx] = arr[compIdx];
                    arr[compIdx] = temp;

                    int tempidx = pivoteIdx;
                    pivoteIdx = compIdx;
                    compIdx = tempidx;

                    compIdx++;
                }
            } else {
                if (arr[compIdx] < arr[pivoteIdx]) {
                    compIdx++;
                } else {
                    int temp = arr[pivoteIdx];
                    arr[pivoteIdx] = arr[compIdx];
                    arr[compIdx] = temp;

                    int tempidx = pivoteIdx;
                    pivoteIdx = compIdx;
                    compIdx = tempidx;

                    compIdx--;
                }
            }
        }

        quickSort(arr, start, pivoteIdx - 1);
        quickSort(arr, pivoteIdx + 1, end);
        return;
    }
}
