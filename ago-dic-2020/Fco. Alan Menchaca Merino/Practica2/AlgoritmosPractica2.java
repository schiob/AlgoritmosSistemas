package javatest;

import java.util.Scanner;

public class AlgoritmosPractica2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] opciones = entrada.nextLine().split(" ");
        int length_problemas = Integer.parseInt(opciones[0]);
        int plazo_minutos = Integer.parseInt(opciones[1]);

        String[] problemas = entrada.nextLine().split(" ");
        int[] problemas_min = new int[length_problemas];

        for (int i = 0; i < length_problemas; i++) {
            problemas_min[i] = Integer.parseInt(problemas[i]);
        }

        // Ordenamos la lista
        InsertionSort.sort(problemas_min);

        int problemasResueltos = 0;
        int minutosAcumulados = 0;

        while ((minutosAcumulados < plazo_minutos) && (problemasResueltos < length_problemas)) {
            minutosAcumulados += problemas_min[problemasResueltos++];
        }

        String msg = String.format("\nSe resolvieron %d problemas en %d minutos.",
                problemasResueltos, minutosAcumulados);
        System.out.println(msg);

    }
}
