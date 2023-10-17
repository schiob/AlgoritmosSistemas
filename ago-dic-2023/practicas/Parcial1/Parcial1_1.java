import java.util.Scanner;

public class Parcial1_1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        s.nextLine();
        String[] peliculas = new String[n];

        for (int i = 0; i < n; i++) {
            peliculas[i] = s.nextLine();
        }

        MergeSort(peliculas, 0, n - 1);

        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public static void MergeSort(String[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
            Merge(arr, l, m, r);
        }
    }

    public static void Merge(String[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String[] L = new String[n1];
        String[] R = new String[n2];

        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (compararPeliculas(L[i], R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static int compararPeliculas(String pelicula1, String pelicula2) {
        int duracion1 = obtenerDuracion(pelicula1);
        int duracion2 = obtenerDuracion(pelicula2);

        return duracion1 == duracion2 ? pelicula1.compareTo(pelicula2) : duracion1 - duracion2;
    }

    public static int obtenerDuracion(String pelicula) {
        String[] partes = pelicula.split(" ");
        int horas = Integer.parseInt(partes[1]);
        int minutos = Integer.parseInt(partes[2]);
        return horas * 60 + minutos;
    }
}
