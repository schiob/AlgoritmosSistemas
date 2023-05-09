package algoritmos;
import java.util.Scanner;

public class Practica7 {
        public static void quicksort(String[] arreglo, int l, int r) {
        if (l < r) {
            int p = partition(arreglo, l, r);
            quicksort(arreglo, l, p - 1);
            quicksort(arreglo, p + 1, r);
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
        Scanner s = new Scanner(System.in); //Scanner de enteros
        Scanner e = new Scanner (System.in); //Scanner de strings

        System.out.println("Cantidad de medicinas y peticiones: ");
        int n = s.nextInt();
        int q = s.nextInt();
        s.nextLine();
        
        System.out.println("Nombres de medicinas existentes: ");
        String[] medicinas = e.nextLine().split(" ");
        
        System.out.println("Medicinas buscadas: ");
        quicksort(medicinas, 0, n - 1);
        
        for (int i = 0; i < q; i++) {
            String medicinaBuscada = s.nextLine().trim();
            int posicion = binarySearch(medicinas, medicinaBuscada);
            System.out.println(posicion);
        }
    }
}
