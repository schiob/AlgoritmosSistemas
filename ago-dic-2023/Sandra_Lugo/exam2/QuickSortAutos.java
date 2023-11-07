package Practicas;
import java.util.Scanner;

class carritos {
    String nombre;
    int kilometraje;

    public carritos(String nombre, int kilometraje) {
        this.nombre = nombre;
        this.kilometraje = kilometraje;
    }
}

public class QuickSortAutos {

    public static void quickSort(carritos[] autos, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(autos, inicio, fin);
            quickSort(autos, inicio, indicePivote - 1);
            quickSort(autos, indicePivote + 1, fin);
        }
    }

    private static int particion(carritos[] autos, int inicio, int fin) {
        carritos pivote = autos[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (autos[j].kilometraje > pivote.kilometraje) {
                i++;
                carritos temp = autos[i];
                autos[i] = autos[j];
                autos[j] = temp;
            }
        }

        carritos temp = autos[i + 1];
        autos[i + 1] = autos[fin];
        autos[fin] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que teclee el número de carritos
        System.out.println("Teclea el numero de carritos:");
        int n = Integer.parseInt(scanner.nextLine());
        carritos[] autos = new carritos[n];

        // Solicita al usuario que escriba las marcas y el kilometraje de los carritos
        System.out.println("Escribe las marcas y el kilometraje de cada carrito:");
        for (int i = 0; i < n; i++) {
            String[] entrada = scanner.nextLine().split(" ");
            String nombreAuto = entrada[0];
            for (int j = 1; j < entrada.length - 1; j++) {
                nombreAuto += " " + entrada[j];
            }
            autos[i] = new carritos(nombreAuto, Integer.parseInt(entrada[entrada.length - 1]));
        }

        quickSort(autos, 0, autos.length - 1);

        // Indica que los carritos están ordenados
        System.out.println("Los carritos están ordenados por kilometraje de mayor a menor:");
        for (carritos auto : autos) {
            System.out.print(auto.nombre + " ");
        }
        System.out.println(); // Añade un salto de línea al final de la salida estetico
        scanner.close();
    }
}
