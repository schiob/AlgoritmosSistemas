package Parcial_1;

import java.util.Scanner;

public class Primer_Problema {

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            
            // Mover los elementos que son mayores que la clave a una posición adelante
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        //Numero de documentos
        int n = sc.nextInt();
        sc.nextLine();
        
        // Nombres de los medicamentos
        String[] medicinas = sc.nextLine().split(" ");
        
        // Ordenar alfabéticamente
        insertionSort(medicinas);
        
        // Imprimir resultado
        for (int i = 0; i < medicinas.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(medicinas[i]);
        }
        System.out.println();
        
        sc.close();
    }
}

    
