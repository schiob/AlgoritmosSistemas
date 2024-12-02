package Practicas;
import java.util.Scanner;

public class Practica5 {

    static class Libro {
        String nombre;
        int paginas;

        Libro(String nombre, int paginas) {
            this.nombre = nombre;
            this.paginas = paginas;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de libros que tiene juan: ");
        int n = sc.nextInt();
        sc.nextLine();

        Libro[] libros = new Libro[n];

        for (int i = 0; i < libros.length; i++) {
            String nombre = sc.next();
            int paginas = sc.nextInt();
            libros[i] = new Libro(nombre, paginas);
        }

        libros = insertItems(libros);

        for (Libro libro : libros) {
            System.out.print(libro.nombre + " ");
        }

        sc.close();
    }

    //METODO PARA INGRESAR LOS DATOS A LOS ARREGLOS
    public static Libro[] insertItems(Libro[] libros) {
        if (libros.length < 2) {
            return libros;
        }

        int middle = libros.length / 2;
        Libro left[] = new Libro[middle];
        Libro right[] = new Libro[libros.length - left.length];

        int i;
        for (i = 0; i < left.length; i++) {
            left[i] = libros[i];
        }

        int k = 0;
        for (int j = i; j < libros.length; j++) {
            right[k] = libros[j];
            k++;
        }

        left = insertItems(left);
        right = insertItems(right);

        return merge(left, right);
    }

    //METODO MERGE
    public static Libro[] merge(Libro[] left, Libro[] right) {
        Libro[] result = new Libro[left.length + right.length];

        int arr_res = 0;
        int idx_izq = 0;
        int idx_der = 0;

        while (idx_izq < left.length && idx_der < right.length) {
            if (left[idx_izq].paginas < right[idx_der].paginas) {
                result[arr_res] = left[idx_izq];
                idx_izq++;
            } else {
                result[arr_res] = right[idx_der];
                idx_der++;
            }
            arr_res++;
        }
        while (idx_izq < left.length) {
            result[arr_res] = left[idx_izq];
            idx_izq++;
            arr_res++;
        }

        while (idx_der < right.length) {
            result[arr_res] = right[idx_der];
            idx_der++;
            arr_res++;
        }
        
        return result;
    }
}
