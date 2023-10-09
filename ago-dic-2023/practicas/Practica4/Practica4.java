import java.util.Arrays;
import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea


        String[] palabras = scanner.nextLine().split(" ");

        // Ordenar las palabras utilizando Arrays.sort()
        Arrays.sort(palabras);


        for (int i = 0; i < n; i++) {
            System.out.print(palabras[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
