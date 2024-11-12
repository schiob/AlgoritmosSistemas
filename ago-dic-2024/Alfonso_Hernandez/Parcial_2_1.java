package Parcial_2;

import java.util.Scanner;

public class Parcial_2_1 {

    // Mapa que define el orden de los colores del arcoíris
    private static final String[] COLOR_ORDER = {"Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de plumones
        int n = Integer.parseInt(scanner.nextLine());
        String[] plumones = new String[n];

        // Leer los plumones
        for (int i = 0; i < n; i++) {
            plumones[i] = scanner.nextLine();
        }

        // Ordenar los plumones utilizando Quick Sort
        quickSort(plumones, 0, plumones.length - 1);

        // Imprimir los plumones ordenados
        for (String plumon : plumones) {
            System.out.println(plumon);
        }

        scanner.close();
    }

    // Método de Quick Sort
    private static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Método para particionar el array
    private static int partition(String[] array, int low, int high) {
        String pivot = array[high]; // Elegimos el último elemento como pivote
        int i = (low - 1); // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual que el pivote
            if (comparePlumones(array[j], pivot) <= 0) {
                i++;
                // Intercambiamos array[i] y array[j]
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Intercambiamos array[i + 1] y array[high] (o pivote)
        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Método para comparar plumones
    private static int comparePlumones(String plumon1, String plumon2) {
        String[] parts1 = plumon1.split("-");
        String[] parts2 = plumon2.split("-");

        String color1 = parts1[0];
        String color2 = parts2[0];
        int dilution1 = Integer.parseInt(parts1[1]);
        int dilution2 = Integer.parseInt(parts2[1]);

        int colorComparison = Integer.compare(getColorIndex(color1), getColorIndex(color2));
        if (colorComparison != 0) {
            return colorComparison;
        }

        return Integer.compare(dilution1, dilution2);
    }

    // Método para obtener el índice de un color en el orden del arcoíris
    private static int getColorIndex(String color) {
        for (int i = 0; i < COLOR_ORDER.length; i++) {
            if (COLOR_ORDER[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }
}
