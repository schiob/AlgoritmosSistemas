import java.util.Scanner;

public class Practica2 {
    
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] problemas = new int[n];
        
        for (int i = 0; i < n; i++) {
            problemas[i] = scanner.nextInt();
        }
        
        insertionSort(problemas);
        
        int problemasResueltos = 0;
        int tiempoTotal = 0;
        
        for (int i = 0; i < n; i++) {
            if (tiempoTotal + problemas[i] <= m) {
                problemasResueltos++;
                tiempoTotal += problemas[i];
            } else {
                break;
            }
        }
        
        System.out.println(problemasResueltos);
        
        scanner.close();
    }
}
