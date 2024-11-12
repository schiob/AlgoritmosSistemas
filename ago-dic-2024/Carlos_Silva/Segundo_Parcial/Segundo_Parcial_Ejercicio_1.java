package Segundo_Parcial;

import java.util.Scanner;

public class Segundo_Parcial_Ejercicio_1 {

    public static class Colores {
        String plumon;
        int dilusion;

        public Colores(String plumon, int dilusion) {
            this.plumon = plumon;
            this.dilusion = dilusion;
        }
    }
    public static void main(String[] args) {
        String[] arcoiris = {"rojo", "anaranjado", "amarillo", "verde", "indigo", "violeta", "azul"};

        int[] lst = {};

        Scanner sc = new Scanner(System.in);
        int num_color = sc.nextInt();
        sc.nextLine();

        Colores[] colores = new Colores[num_color];

        for (int i = 0; i < colores.length; i++) {
            String plumon = sc.next();
            int dilusion = sc.nextInt();
            colores[i] = new Colores(plumon, dilusion);
        }

        for (int i = 0; i < arcoiris.length; i++) {
            
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
