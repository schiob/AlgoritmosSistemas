package algoritmos;

import java.util.Scanner;

public class Practica_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] pokemon = new int[n];

        for (int i = 0; i < n; i++) {
            pokemon[i] = scanner.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pokemon[j] < pokemon[j + 1]) {

                    int temp = pokemon[j];
                    pokemon[j] = pokemon[j + 1];
                    pokemon[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(pokemon[i] + " ");
        }
    }
}
