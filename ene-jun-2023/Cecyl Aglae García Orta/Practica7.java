package Parcial2;
import java.util.Scanner;

/*@author cecyl*/
public class Practica7 {
    
     public static void quicksort(String[] arreglo, int low, int high) {
        if (low < high) {
            int pi = partition(arreglo, low, high);
            quicksort(arreglo, low, pi - 1);
            quicksort(arreglo, pi + 1, high);
        }
    }

    public static int partition(String[] arreglo, int low, int high) {
        String pivote = arreglo[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arreglo[j].compareTo(pivote) < 0) {
                i++;
                String sec = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = sec;
            }
        }
        String sec = arreglo[i + 1];
        arreglo[i + 1] = arreglo[high];
        arreglo[high] = sec;
        return i + 1;
    }

    public static int binarySearch(String[] arreglo, String target) {
        int low = 0;
        int high = arreglo.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arreglo[mid].equals(target)) {
                return mid;
            } else if (arreglo[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar datos de num de medicinas
        System.out.println("Numero de medicinas y numero de peticiones: ");
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        // Capturar datos de nombre de medicinas
        System.out.println("Nombres de medicinas disponibles: ");
        String[] medicinas = scanner.nextLine().split(" ");

        // Capturar medicinas que se buscan
        System.out.println("Medicinas buscadas: ");
        quicksort(medicinas, 0, n - 1);

        // Leer las medicinas buscadas y buscar sus posiciones
        for (int i = 0; i < q; i++) {
            String medicinaBuscada = scanner.nextLine().trim();
            int posicion = binarySearch(medicinas, medicinaBuscada);
            System.out.println(posicion);
        }
    }
}
