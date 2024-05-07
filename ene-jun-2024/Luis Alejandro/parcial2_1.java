import java.util.*;

public class parcial2_1 {
    
    static void quickSort(String[] arr, int bottom, int top) {
        if (bottom < top) {
            int pi = mitad(arr, bottom, top);
            quickSort(arr, bottom, pi - 1);
            quickSort(arr, pi + 1, top);
        }
        System.out.println("la playlist ordenada es: ");
    }

    static int mitad(String[] arr, int bottom1, int top1) {
        String pivote = arr[top1];
        int i = bottom1 - 1;
        for (int j = bottom1; j < top1; j++) {
            if (arr[j].compareTo(pivote) < 0) {
                i++;
                String temporal = arr[i];
                arr[i] = arr[j];
                arr[j] = temporal;
            }
        }
        String temporal = arr[i + 1];
        arr[i + 1] = arr[top1];
        arr[bottom1] = temporal;
        return i + 1;
    }
    static int binarySearch(String[] arr, String x) {
        int menor = 0;
        int mayor = arr.length - 1;
        while (menor <= mayor) {
            int mitad = menor + (mayor - menor) / 2;
            int result = x.compareTo(arr[mitad]);
            if (result == 0) {
                return mitad;
            } else if (result < 0) {
                mayor = mitad - 1;
            } else {
                menor = mitad + 1;
            }
        }
        return -1; // regresar si no existe la cancion
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N_canciones = scanner.nextInt(); 
        int Q_peticiones = scanner.nextInt(); 

        String[] playlist = new String[N_canciones];
        for (int i = 0; i < N_canciones; i++) {
            playlist[i] = scanner.next();
        }

        // Ordenar la playlist
        quickSort(playlist, 0, N_canciones - 1);

        // Imprimir la nueva orden de la playlist
        for (String song : playlist) {
            System.out.print(song + " ");
        }
        System.out.println();

        // Realizar las búsquedas
        for (int i = 0; i < Q_peticiones; i++) {
            String songToFind = scanner.next();
            // Buscar la canción en la playlist ordenada
            int index = binarySearch(playlist, songToFind);
            if (index != -1) {
                System.out.println(index + 1); // Imprimir la posición (1-indexed)
            } else {
                System.out.println("Canción no encontrada");
            }
        }

        scanner.close();
    }
}
