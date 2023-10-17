
import java.util.Scanner;
import java.util.*;
public class PrimerParcilaE2 {

    public Scanner scanner = new Scanner(System.in);
    public List<Pelicula> peliculas = new ArrayList<>();

    public static void main(String[] args) {
        PrimerParcilaE2 organizador = new PrimerParcilaE2();
        organizador.ejecutar();
    }

    public void ejecutar() {
        capturarPeliculas();
        System.out.println("Peliculas ingresadas: " + peliculas);
        peliculas.sort(Comparator.comparingInt(Pelicula::getDuracionEnMinutos));
        System.out.println("Peliculas ordenadas por duración: " + peliculas);
    }

    public void capturarPeliculas() {
        System.out.print("Ingresa la cantidad de Peliculas: ");
        int numeroDePeliculas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Formato: 'Nombre' 'Horas' 'Minutos'");
        for (int i = 0; i < numeroDePeliculas; i++) {
            String nombre = scanner.next();
            int horas = scanner.nextInt();
            int minutos = scanner.nextInt();
            peliculas.add(new Pelicula(nombre, horas, minutos));
        }
    }


    public class Pelicula {
        public String nombre;
        public int horas;
        public int minutos;

        public Pelicula(String nombre, int horas, int minutos) {
            this.nombre = nombre;
            this.horas = horas;
            this.minutos = minutos;
        }

        public int getDuracionEnMinutos() {
            return horas * 60 + minutos;
        }

        public String toString() {
            return nombre + " (" + horas + "h " + minutos + "m)";
        }
    }
}


