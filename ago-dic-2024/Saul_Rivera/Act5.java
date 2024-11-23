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

public class Act5 {

    public static void mergeSort(List<Libro> libros, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSort(libros, inicio, medio);
            mergeSort(libros, medio + 1, fin);
            merge(libros, inicio, medio, fin);
        }
    }

    public static void merge(List<Libro> libros, int inicio, int medio, int fin) {
        List<Libro> izquierda = new ArrayList<>(libros.subList(inicio, medio + 1));
        List<Libro> derecha = new ArrayList<>(libros.subList(medio + 1, fin + 1));

        int i = 0, j = 0, k = inicio;

        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i).paginas <= derecha.get(j).paginas) {
                libros.set(k++, izquierda.get(i++));
            } else {
                libros.set(k++, derecha.get(j++));
            }
        }

        while (i < izquierda.size()) {
            libros.set(k++, izquierda.get(i++));
        }

        while (j < derecha.size()) {
            libros.set(k++, derecha.get(j++));
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

        for (Libro libro : libros) {
            System.out.print(libro.nombre + " ");
        }
    }
}
