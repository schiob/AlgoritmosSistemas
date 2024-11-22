import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ColorId = new int[n];

        for (int i = 0; i < n; i++) {
            ColorId[i] = scanner.nextInt();
        }

        quickSort(ColorId, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(ColorId[i] + (i < n - 1 ? " " : "\n"));
        }
        scanner.close();
    }

    // Algoritmo Quick Sort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = particion(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Pivote
    private static int particion(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                Intercambio(arr, i, j);
            }
        }
        Intercambio(arr, i + 1, high);
        return i + 1;
    }

    private static void Intercambio(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
