import java.util.Scanner;

public class Parcial2E2 {
    public static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int binarySearch(String[] arr, String x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0) {
                return m;
            }
            if (res > 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas canciones deseas ingresar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el nombre de la canción " + (i + 1) + ":");
            arr[i] = scanner.nextLine();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Playlist ordenada:");
        for (String song : arr) {
            System.out.println(song);
        }

        System.out.println("¿Qué canción estás buscando?");
        String x = scanner.nextLine();

        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("\nLa canción no está en la playlist");
        } else {
            System.out.println("\nLa canción se encuentra en la posición: " + result);
        }
        
    }
}
