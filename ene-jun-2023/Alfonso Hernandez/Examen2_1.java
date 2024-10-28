package Examen2;

import java.util.Arrays;
import java.util.Scanner;

public class Examen2_1 {
//primer entero **n** representa el número de libros en la repisa de mate y el string **x** el nombre del libro que busca Toño.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String x = sc.next();
        String[] n = new String[l];
        for (int i = 0; i < l; i++) {
            n[i] = sc.next();
        }
        Arrays.sort(n);
        int indice = busquedaBinaria(n, x);
        System.out.println(indice);
    }

    public static int busquedaBinaria(String[] arr, String elem) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            if (arr[mitad].equals(elem)) {
                return mitad;
            } else if (arr[mitad].compareTo(elem) < 0) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        return -1;
    }
}
