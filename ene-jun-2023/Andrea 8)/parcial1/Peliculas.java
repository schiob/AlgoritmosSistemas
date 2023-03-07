package algoritmos.parcial1;
import java.util.*;
/**
 * Fecha: 6 de marzo de 2023
 * @author Luz Andrea
 */
public class Peliculas {
    class Pelicula {
    String nombre;
    int duracion;

    public Pelicula(String nombre, int horas, int minutos) {
        this.nombre = nombre;
        this.duracion = horas * 60 + minutos;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pelicula> peliculas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nombre = sc.next();
            int horas = sc.nextInt();
            int minutos = sc.nextInt();
            peliculas.add(new Pelicula(nombre, horas, minutos));
        }
        mergeSort(peliculas, 0, peliculas.size() - 1);
        for (Pelicula p : peliculas) {
            System.out.print(p.nombre + " ");
        }
    }

    public static void mergeSort(List<Pelicula> peliculas, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSort(peliculas, inicio, medio);
            mergeSort(peliculas, medio + 1, fin);
            merge(peliculas, inicio, medio, fin);
        }
    }

    public static void merge(List<Pelicula> peliculas, int inicio, int medio, int fin) {
        List<Pelicula> aux = new ArrayList<>();
        int i = inicio;
        int j = medio + 1;
        while (i <= medio && j <= fin) {
            if (peliculas.get(i).duracion <= peliculas.get(j).duracion) {
                aux.add(peliculas.get(i));
                i++;
            } else {
                aux.add(peliculas.get(j));
                j++;
            }
        }
        while (i <= medio) {
            aux.add(peliculas.get(i));
            i++;
        }
        while (j <= fin) {
            aux.add(peliculas.get(j));
            j++;
        }
        for (int k = 0; k < aux.size(); k++) {
            peliculas.set(inicio + k, aux.get(k));
        }
    }
}
}
