package Practicas;
import java.util.*;

public class Ejercicio_2 {

    public static class Peli {
        String nombre;
        int totalMin;

        public Peli(String nom, int hrs, int min) {
            this.nombre = nom;  
            this.totalMin = hrs * 60 + min;
        }
    }

    public static void mergeSort(Peli[] pelis) {
        if (pelis.length < 2) return;  

        int mid = pelis.length / 2;
        Peli[] izquierda = new Peli[mid];
        Peli[] derecha = new Peli[pelis.length - mid];

        System.arraycopy(pelis, 0, izquierda, 0, mid);
        System.arraycopy(pelis, mid, derecha, 0, pelis.length - mid);

        mergeSort(izquierda);
        mergeSort(derecha);

        merge(pelis, izquierda, derecha);
    }

    public static void merge(Peli[] pelis, Peli[] izquierda, Peli[] derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i].totalMin <= derecha[j].totalMin) {
                pelis[k++] = izquierda[i++];
            } else {
                pelis[k++] = derecha[j++];
            }
        }

        while (i < izquierda.length) {
            pelis[k++] = izquierda[i++];
        }

        while (j < derecha.length) {
            pelis[k++] = derecha[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de películas:");
        int n = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido para la cantidad de películas.");
            scanner.nextLine();
        }
        n = scanner.nextInt();
        scanner.nextLine();  // Limpia el salto de línea del buffer.

        Peli[] pelis = new Peli[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la película:");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese las horas de duración de la película:");
            int horas = 0;
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para las horas.");
                scanner.nextLine();
            }
            horas = scanner.nextInt();
            
            System.out.println("Ingrese los minutos de duración de la película:");
            int minutos = 0;
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido para los minutos.");
                scanner.nextLine();
            }
            minutos = scanner.nextInt();
            scanner.nextLine();  // Limpia el salto de línea del buffer.

            pelis[i] = new Peli(nombre, horas, minutos);
        }

        mergeSort(pelis);

        System.out.println("Películas ordenadas por duración:");
        for (int i = 0; i < n; i++) {
            System.out.print(pelis[i].nombre + " ");
        }
    }
}
