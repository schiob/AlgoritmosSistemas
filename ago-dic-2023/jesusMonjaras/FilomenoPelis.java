package parcial1;

import java.util.Scanner;

public class FilomenoPelis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce el numero de peliculas: ");
        int numeroPeliculas = scn.nextInt();
        scn.nextLine();

        String[] nombresPeliculas = new String[numeroPeliculas];
        int[] duracionPeliculas = new int[numeroPeliculas];
        
        int i = 0;
        while (i < numeroPeliculas) {
            System.out.print("Pelicula " + (i + 1) + ": ");
            String[] nPelicula = scn.nextLine().split(" ");

            int duracionPelicula = (Integer.parseInt(nPelicula[1]) * 60) + (Integer.parseInt(nPelicula[2]));
            duracionPeliculas[i] = duracionPelicula;
            nombresPeliculas[i] = nPelicula[0];
            i++;
        }
        scn.close();

        mergeSort(duracionPeliculas);

        i = 0;
        for (; i < nombresPeliculas.length; i++) {
            System.out.print(nombresPeliculas[i] + " " + duracionPeliculas[i] + " ");
        }
    }

    private static void mergeSort(int[] duracionPeliculas) {

        int tamano = duracionPeliculas.length;
        if (tamano <= 1) {
            return;
        }

        int mitad = tamano / 2;
        int[] arrIzq = new int[mitad];
        int[] arrDer = new int[tamano - mitad];
        int j = 0;

        for (int i = 0; i < tamano; i++) {
            if (i < mitad) {
                arrIzq[i] = duracionPeliculas[i];
            } else {
                arrDer[j] = duracionPeliculas[i];
                j++;
            }
        }
        mergeSort(arrIzq);
        mergeSort(arrDer);
        merge(arrIzq, arrDer, duracionPeliculas);
    }

    private static void merge(int[] arrIzq, int[] arrDer, int[] arr) {

        int tamanoIzq = arr.length / 2;
        int tamanoDer = arr.length - tamanoIzq;
        int i = 0, izq = 0, der = 0;

        while (izq < tamanoIzq && der < tamanoDer) {
            if (arrIzq[izq] < arrDer[der]) {
                arr[i] = arrIzq[izq];
                i++;
                izq++;
            } else {
                arr[i] = arrDer[der];
                i++;
                der++;
            }
        }
        while (izq < tamanoIzq) {
            arr[i] = arrIzq[izq];
            i++;
            izq++;
        }
        while (der < tamanoDer) {
            arr[i] = arrDer[der];
            i++;
            der++;
        }
    }
}
