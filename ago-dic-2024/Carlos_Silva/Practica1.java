package Silva_Carlos;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //INTRODUCIR LOS NUMEROS ENTEROS SEPARADOS POR UN ESPACIO (INPUT)

        System.out.println("Introduce dos numeros enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int suma = a + b;

        //SALIDA DE LOS NUMEROS ENTEROS SUMADOS (OUTPUT)

        System.out.println("Tu resultado es: " + suma);
    }
}
