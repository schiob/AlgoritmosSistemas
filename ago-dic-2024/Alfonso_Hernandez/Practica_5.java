package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Libro {

    String nombre;
    int paginas;

    public Libro(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }
}

public class Practica_5 {

    public static void mergeSort(List<Libro> libros, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;

            // Dividir
            mergeSort(libros, izq, medio);
            mergeSort(libros, medio + 1, der);

            // Combinar
            merge(libros, izq, medio, der);
        }
    }

    public static void merge(List<Libro> libros, int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;

        List<Libro> izquierda = new ArrayList<>(n1);
        List<Libro> derecha = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            izquierda.add(libros.get(izq + i));
        }
        for (int j = 0; j < n2; j++) {
            derecha.add(libros.get(medio + 1 + j));
        }

        int i = 0, j = 0;
        int k = izq;

        // Merge de subarreglos
        while (i < n1 && j < n2) {
            if (izquierda.get(i).paginas <= derecha.get(j).paginas) {
                libros.set(k, izquierda.get(i));
                i++;
            } else {
                libros.set(k, derecha.get(j));
                j++;
            }
            k++;
        }

        // Copiar elementos restantes
        while (i < n1) {
            libros.set(k, izquierda.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            libros.set(k, derecha.get(j));
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Libro> libros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nombre = entrada[0];
            int paginas = Integer.parseInt(entrada[1]);
            libros.add(new Libro(nombre, paginas));
        }

        mergeSort(libros, 0, libros.size() - 1);

        StringBuilder resultado = new StringBuilder();
        for (Libro libro : libros) {
            resultado.append(libro.nombre).append(" ");
        }

        System.out.println(resultado.toString().trim());
    }
}
