package Practica5;
import java.util.Arrays;
import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los nombres de los dinosaurios separados por espacios:");
        String[] dinosaurios = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(ordenarPorLongitud(dinosaurios)));
    }

    public static String[] ordenarPorLongitud(String[] dinosaurios) {
        int mitad = dinosaurios.length / 2;

        // CASO BASE: Si solo hay un dinosaurio, se devuelve tal cual.
        if (dinosaurios.length == 1) {
            return dinosaurios;
        }

        // Dividir el array en dos: izquierda y derecha.
        String[] parteIzquierda = Arrays.copyOfRange(dinosaurios, 0, mitad);
        String[] parteDerecha = Arrays.copyOfRange(dinosaurios, mitad, dinosaurios.length);

        // Ordenar recursivamente ambas mitades.
        parteIzquierda = ordenarPorLongitud(parteIzquierda);
        parteDerecha = ordenarPorLongitud(parteDerecha);

        // Mezclar las dos mitades ordenadas.
        return mezclar(parteIzquierda, parteDerecha);
    }

    public static String[] mezclar(String[] parteIzquierda, String[] parteDerecha) {
        String[] ordenados = new String[parteIzquierda.length + parteDerecha.length];

        int i = 0, j = 0, k = 0;
        while (i < parteIzquierda.length && j < parteDerecha.length) {
            if (parteIzquierda[i].length() < parteDerecha[j].length()) {
                ordenados[k++] = parteIzquierda[i++];
            } else {
                ordenados[k++] = parteDerecha[j++];
            }
        }

        // Copiar elementos restantes de parteIzquierda, si hay.
        while (i < parteIzquierda.length) {
            ordenados[k++] = parteIzquierda[i++];
        }

        // Copiar elementos restantes de parteDerecha, si hay.
        while (j < parteDerecha.length) {
            ordenados[k++] = parteDerecha[j++];
        }

        return ordenados;
    }
}
