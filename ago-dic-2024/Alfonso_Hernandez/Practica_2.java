package algoritmos;

import java.util.Scanner;

public class Practica_2 {
    
    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Mueve los elementos del arreglo que son mayores que la clave, a una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();//Tareas
        int m = scanner.nextInt();//Tiempo
        
        // Leer el tiempo que toma resolver cada problema
        int[] tiempos = new int[n];
        for (int i = 0; i < n; i++) {
            tiempos[i] = scanner.nextInt();
        }
        
        // Ordenar los tiempos usando insertion sort
        insertionSort(tiempos);
        
        // Problemas puede resolver David
        int problemasResueltos = 0;
        int tiempoUsado = 0;
        
        for (int i = 0; i < n; i++) {
            if (tiempoUsado + tiempos[i] <= m) {
                tiempoUsado += tiempos[i];
                problemasResueltos++;
            } else {
                break; 
            }
        }
        
        // Imprimir el número de problemas que puede resolver
        System.out.println(problemasResueltos);
        
        scanner.close();
    }
}
