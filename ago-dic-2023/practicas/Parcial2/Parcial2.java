import java.util.Scanner;

class Auto {
    String nombre;
    int kilometraje;

    Auto(String nombre, int kilometraje) {
        this.nombre = nombre;
        this.kilometraje = kilometraje;
    }
}

public class Parcial2 {

    static void quickSort(Auto[] autos, int low, int high) {
        if (low < high) {
            // La partición del array
            int pi = partition(autos, low, high);

            // Ordenar recursivamente las dos subpartes
            quickSort(autos, low, pi - 1);
            quickSort(autos, pi + 1, high);
        }
    }

    static int partition(Auto[] autos, int low, int high) {
        // Eligiendo el último elemento como pivote
        Auto pivot = autos[high];
        int i = (low - 1); // Índice de menor elemento

        for (int j = low; j < high; j++) {
            // Si el elemento actual es mayor que el pivote
            if (autos[j].kilometraje >= pivot.kilometraje) {
                i++;

                // Intercambiar autos[i] y autos[j]
                Auto temp = autos[i];
                autos[i] = autos[j];
                autos[j] = temp;
            }
        }

        // Intercambiar autos[i+1] y autos[high] (o el pivote)
        Auto temp = autos[i + 1];
        autos[i + 1] = autos[high];
        autos[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea restante

        Auto[] autos = new Auto[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            autos[i] = new Auto(parts[0], Integer.parseInt(parts[1]));
        }

        quickSort(autos, 0, n - 1);

        for (Auto auto : autos) {
            System.out.print(auto.nombre + " ");
        }
        scanner.close();
    }
}
