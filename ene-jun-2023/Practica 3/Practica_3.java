package U1;

import java.util.*;

/**
 *
 * @author Cancino
 */
public class Practica_3 {

    public static void algoritmo(String[] arreglo) {
        String aux;
        for (int i = 0; i < arreglo.length; i++) {
            aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j].length() > aux.length()) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ta = 0;
        do {
            System.out.println("Ingrese el tamaño del arreglo: ");
            Ta = Integer.parseInt(sc.nextLine());
        } while (!(Ta >= 1 && Ta <= 100));
        String[] arreglo = new String[Ta];
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Ingrese los datos en la posicion " + x + " :");

            arreglo[x] = sc.next();
        }
        
        System.out.println("Arreglo Original: " + Arrays.toString(arreglo));
        algoritmo(arreglo);
        System.out.println("Arreglo Original: " + Arrays.toString(arreglo));

    }
}
