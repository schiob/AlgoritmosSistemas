package U1;

import java.util.*;

/**
 *
 * @author Cancino
 */
public class Practica_4 {

    public static void algoritmo(int[] arreglo) {
        for (int i = arreglo.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    swapArreglo(arreglo, j, j + 1);
                }
            }
        }
    }

    public static void printArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void swapArreglo(int[] arreglo, int a, int b) {
        int temporal = arreglo[b];
        arreglo[b] = arreglo[a];
        arreglo[a] = temporal;
    }

    public static int createArreglo() {
        Scanner sc = new Scanner(System.in);
        int Ta = 0;
        do {
            System.out.println("Ingrese el tamaño del arreglo: ");
            Ta = Integer.parseInt(sc.nextLine());
        } while (!(Ta >= 1 && Ta <= 50));
        return Ta;
    }

    public static void putDatos(int[] arreglo) {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < arreglo.length; x++) {
            do{
            System.out.println("Ingrese los datos en la posicion " + x + " :");
            arreglo[x] = sc.nextInt();
            }while(!(arreglo[x] >= 1 &&  arreglo[x] <= 2000));
            
        }
    }

    public static void main(String[] args) {
        int Ta = createArreglo();
        int[] arreglo = new int[Ta];
        putDatos(arreglo);

        System.out.println("Arreglo Original:");
        printArreglo(arreglo);
        algoritmo(arreglo);
        System.out.println("Arreglo Acomodado:");
        printArreglo(arreglo);

    }

}
