package Algoritmos;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa dos enteros separados por un espacio:");
        
        // Leer los enteros desde la entrada estándar
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        // Calcular la suma
        int suma = numero1 + numero2;
        
        // Imprimir la suma en la salida estándar
        System.out.println("La suma de los enteros es: " + suma);
        
        // Cerrar el scanner
        scanner.close();
    }
}
