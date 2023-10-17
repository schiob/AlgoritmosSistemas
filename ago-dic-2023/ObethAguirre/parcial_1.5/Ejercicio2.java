package parcial_1;

import java.util.Arrays;
import java.util.Scanner;
/*
MERGE SORT
 */
public class Ejercicio2 {
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Ingresa la cantidad de peliculas: ");
        int n = s.nextInt();
        s.nextLine();

        System.out.println("'Nombre' 'Horas' 'Minutos' respeta el formato");
        String[] peliculas = new String[n];  //

        for (int i = 0; i < n; i++) {
            String entrada = s.nextLine();
            peliculas[i] = entrada;
        }

        System.out.println("Peliculas desordenadas\n"+Arrays.toString(peliculas));
        System.out.println("Peliculas ordenadas\n"+Arrays.toString(Ordenar(peliculas)));

    }

    public static String[] Ordenar(String[] arr) {
        int micha = arr.length / 2;

        // CASO BASE
        if (arr.length == 1) {
            return arr;
        }

        String[] aIzq = new String[micha];
        String[] aDer = new String[arr.length - micha];

        //LLENAMOS LOS ARREGLOS
        for (int i = 0; i < micha; i++) {
            aIzq[i] = arr[i];
        }

        for (int i = micha; i < arr.length; i++) {
            aDer[i - micha] = arr[i];
        }


        aIzq = Ordenar(aIzq);
        aDer = Ordenar(aDer);

        return juntar(aIzq, aDer);
    }

    public static String[] juntar(String[] aIzq, String[] aDer) {
        String[] ordenados = new String[aIzq.length + aDer.length];

        int i = 0, j = 0, k = 0;
        while (i < aIzq.length && j < aDer.length) {
            int duracionIzq = obtenerDuracion(aIzq[i]);
            int duracionDer = obtenerDuracion(aDer[j]);

            if (duracionIzq <= duracionDer) {
                ordenados[k++] = aIzq[i++];
            } else {
                ordenados[k++] = aDer[j++];
            }
        }

        while (i < aIzq.length) {
            ordenados[k++] = aIzq[i++];
        }

        while (j < aDer.length) {
            ordenados[k++] = aDer[j++];
        }

        return ordenados;
    }

    public static int obtenerDuracion(String pelicula) {
        String[] partes = pelicula.split(" ");
        int horas = Integer.parseInt(partes[1]);  // Cambiado a 1
        int minutos = Integer.parseInt(partes[2]);  // Cambiado a 2
        return horas * 60 + minutos;
    }

}