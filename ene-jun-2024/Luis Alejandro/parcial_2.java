package Luis Alejandro;
import java.util.Scanner;
public class parcial_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n_libros = scanner.nextInt();
        String titulos_libros = scanner.next();

        // Leer libros
        String[] libros = new String[n_libros];
        for (int i = 0; i < n_libros; i++) {
            libros[i] = scanner.next();
        }

        // se busca libro
        int posicion_arreglo = tituloLibro(libros, titulos_libros);
        System.out.println("El libro: "+ titulos_libros + " esta en la posicion " + posicion_arreglo + " de la repisa");
    }

    public static int tituloLibro(String[] libros, String libroencontrado) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].equals(libroencontrado)) {
                return i + 1; 
            }
        }
        return -1; //regresar si no se encontró
    }
}

