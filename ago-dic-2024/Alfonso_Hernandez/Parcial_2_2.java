package Parcial_2;

import java.util.Scanner;

public class Parcial_2_2 {

    public static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        // Encontrar el valor máximo en el arreglo
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Crear un array de conteo
        int[] count = new int[max + 1];

        // Contar las ocurrencias de cada número
        for (int num : arr) {
            count[num]++;
        }

        // Reescribir el arreglo original con los números ordenados
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de elementos
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Leer los elementos del arreglo
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ordenar el arreglo usando Counting Sort
        countingSort(arr);

        // Imprimir el arreglo ordenado
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
