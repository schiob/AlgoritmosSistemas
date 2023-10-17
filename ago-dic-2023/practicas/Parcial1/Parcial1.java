import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] medicinas = scanner.nextLine().split(" ");

        // Aplica el ordenamiento por selección
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (medicinas[j].compareTo(medicinas[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Intercambia las medicinas
            String temp = medicinas[i];
            medicinas[i] = medicinas[minIndex];
            medicinas[minIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(medicinas[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
