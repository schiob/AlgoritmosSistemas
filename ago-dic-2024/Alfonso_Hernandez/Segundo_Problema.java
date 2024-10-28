package Parcial_1;

import java.util.Scanner;

public class Segundo_Problema {
    
     // Bubble Sort
    public static void bubbleSort(String[] nombres, int[] cantidades) {
        String tempNombre;
        int tempCantidad;
        for (int j = 0; j < cantidades.length - 1; j++) {
            for (int i = 0; i < cantidades.length - 1 - j; i++) {
                // Ordenar de mayor a menor según la cantidad
                if (cantidades[i] < cantidades[i + 1]) {
                    // Intercambiar las cantidades
                    tempCantidad = cantidades[i];
                    cantidades[i] = cantidades[i + 1];
                    cantidades[i + 1] = tempCantidad;
                    
                    
                    tempNombre = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = tempNombre;
                }
            }
        }
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        // Leer los nombres y cantidades de pastillas
        String[] nombres = new String[n];
        int[] cantidades = new int[n];
        
        for (int i = 0; i < n; i++) {
            nombres[i] = scanner.next();
            cantidades[i] = scanner.nextInt();
        }
        
        bubbleSort(nombres, cantidades);
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(" ");
            System.out.print(nombres[i]);
        }
        
        scanner.close();
        
    }
}


    
