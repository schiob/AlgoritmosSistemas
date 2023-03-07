package algoritmos.parcial1;
import java.util.*;

class Pelicula {
    String nombre;
    int duracion;

    public Pelicula(String nombre, int h, int m) {
        this.nombre = nombre;
        this.duracion = (h*60)+ m;
    }
}

public class Pelicula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Objeto para enteros
        Scanner r = new Scanner(System.in); //Objeto para cadenas
        System.out.println("¿Cuántas películas deseas ordenar?");
        int n = s.nextInt();
        List<Pelicula> peliculas = new ArrayList<>();
        System.out.println("Ingresa el nombre y duración de cada película (separado por un espacio)");
        for (int i = 0; i < n; i++) {
            String nombre = r.next();
            int h = s.nextInt();
            int m = s.nextInt();
            peliculas.add(new Pelicula(nombre, h, m));
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