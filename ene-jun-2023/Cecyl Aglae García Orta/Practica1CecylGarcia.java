package algoritmos;

import java.util.Scanner;

/*@author cecyl*/
public class Practica1CecylGarcia {

    /*Escribe un programa que tome como entrada 2
    enteros separados por un espacio e imprima la 
    suma de estos 2 enteros.*/
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Primer número de la suma: ");
       int a = s.nextInt();
       System.out.println("Segundo número de la suma: ");
       int b = s.nextInt();
       System.out.println("Resultado de: " + a + " + " + b + " = " + (a+b));
    }
    
}
