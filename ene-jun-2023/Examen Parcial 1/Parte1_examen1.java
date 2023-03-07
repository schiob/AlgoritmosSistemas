package U1;

import java.util.Scanner;

/**
 *
 * @author Cancino
 */
public class Parte1_examen1 {

    public static void algoritmo(String[] arreglo) {
        String aux;
        for (int i = 0; i < arreglo.length; i++) {
            aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j].length() < aux.length()) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }

    public static void printArreglo(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lista;
        System.out.println("Ingrese los nombres de dinosaurios separados por un espacio: ");
        lista = sc.nextLine();
        String separador = " ";
        String[] arreglo = lista.split(separador);

        algoritmo(arreglo);
        printArreglo(arreglo);

    }

}
