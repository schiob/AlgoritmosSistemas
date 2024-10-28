package Algoritmos_Ordenamiento_Busqueda;

import java.util.Scanner;

public class Examen_1 {

    public static void main(String args[]) {

        //Este codigo se realizo implementando el algoritmo de Selection Sort
        Scanner sc = new Scanner(System.in);
        String[] dinosaurios = sc.nextLine().split(" ");
        sc.close();

        int n = dinosaurios.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (dinosaurios[j].length() > dinosaurios[minimo].length()) {
                    minimo = j;
                }
            }

            String temp = dinosaurios[i];
            dinosaurios[i] = dinosaurios[minimo];
            dinosaurios[minimo] = temp;
        }

        for (String elem : dinosaurios) {
            System.out.println(elem);
        }

    }
}
