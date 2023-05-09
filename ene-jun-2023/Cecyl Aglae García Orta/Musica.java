package Parcial2;
import java.util.*;

/*@author cecyl*/

public class Musica {
    
    //metodo de ayuda para el quick
    private static int partir(String[] cancion, int abajo, int arriba) {
        String pivote = cancion[arriba];
        int i = abajo - 1;
        for (int j = abajo; j < arriba; j++) {
            if (cancion[j].compareTo(pivote) < 0) {
                i++;
                String aux = cancion[i];
                cancion[i] = cancion[j];
                cancion[j] = aux;
            }
        }
        String aux = cancion[i + 1];
        cancion[i + 1] = cancion[arriba];
        cancion[arriba] = aux;
        return i + 1;
    }
    
    //Algoritmo quicksort
    private static void quickSort(String[] cancion, int abajo, int arriba) {
        if (abajo < arriba) {
            int x = partir(cancion, abajo, arriba);
            quickSort(cancion, abajo, x - 1);
            quickSort(cancion, x + 1, arriba);
        }
    }
    
    // Algoritmo bynarysearch
    private static int binarySearch(String[] cancion, String target) {
        int abajo = 0;
        int arriba = cancion.length - 1;
        while (abajo <= arriba) {
            int mid = abajo + (arriba - abajo) / 2;
            if (cancion[mid].equals(target)) {
                return mid + 1;
            }
            if (cancion[mid].compareTo(target) < 0) {
                abajo = mid + 1;
            } else {
                arriba = mid - 1;
            }
        }
        return -1;
    }
    
    //main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de canciones:");
        int N = scanner.nextInt();
        System.out.println("Numero de peticiones:");
        int Q = scanner.nextInt();
        System.out.println("Canciones disponibles y buscadas:");
        scanner.nextLine();
        String[] playlist = scanner.nextLine().split(" ");
        
        // Uso quicksort
        quickSort(playlist, 0, N - 1);
        
        // Imprimo ya ordenado
        System.out.println("Canciones ordenadas:");
        for (String song : playlist) {
            System.out.print(song + " ");
        }
        System.out.println();
        System.out.println("Posiciones:");
        for (int i = 0; i < Q; i++) {
            String songToFind = scanner.nextLine();
            
            // Uso binarysearch
            int indice = binarySearch(playlist, songToFind);
            if (indice != -1) {
                indice--;
            }
            System.out.println(indice);
        }   
    }
}
