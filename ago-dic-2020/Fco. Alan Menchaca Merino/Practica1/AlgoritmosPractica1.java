package javatest;

import java.util.Scanner;

public class AlgoritmosPractica1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa dos valores enteros separados por un espacio: ");
        String[] numerosEnteros = entrada.nextLine().split(" ");
        int x = Integer.parseInt(numerosEnteros[0]);
        int y = Integer.parseInt(numerosEnteros[1]);
        int suma = (x + y);

        if ((x >= -100) && (y <= 100)) {
            String mensaje = String.format("La suma de los números 'X' = %d y 'Y' = %d es: %d", x, y, suma);
            System.out.println(mensaje);
        } else {
            System.out.println("No es posible realizar la suma: (x >= -100) && (y <= 100)");
        }
    }
}
