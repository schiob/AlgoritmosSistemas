package Algoritmos_Ordenamiento_Busqueda;

import java.util.*;

public class Examen_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Pelicula[] movies = new Pelicula[n];

        for (int i = 0; i < n; i++) {
            String title = scanner.next();
            int duration = scanner.nextInt();
            int minutos = scanner.nextInt();
            movies[i] = new Pelicula(title, duration, minutos);
        }

        mergeSort(movies, 0, n - 1);

        for (Pelicula movie : movies) {
            System.out.print(movie.title + " ");
        }
    }

    static void mergeSort(Pelicula[] movies, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(movies, left, mid);
            mergeSort(movies, mid + 1, right);
            merge(movies, left, mid, right);
        }
    }

    static void merge(Pelicula[] movies, int left, int mid, int right) {
        Pelicula[] temp = new Pelicula[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (movies[i].duration < movies[j].duration) {
                temp[k++] = movies[i++];
            } else {
                temp[k++] = movies[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = movies[i++];
        }

        while (j <= right) {
            temp[k++] = movies[j++];
        }

        for (i = left; i <= right; i++) {
            movies[i] = temp[i - left];
        }
    }

    static class Pelicula {
        String title;
        int duration;
        int quality;

        Pelicula(String title, int duration, int quality) {
            this.title = title;
            this.duration = duration;
            this.quality = quality;
        }
    }
}


