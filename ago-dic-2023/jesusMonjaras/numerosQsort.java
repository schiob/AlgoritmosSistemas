import java.util.Scanner;

public class numerosQsort {

    static void countingSort(int arr[], int n, int exp) {
        int salida[] = new int[n];
        int conteo[] = new int[10];
        
        int maximo = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            conteo[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            conteo[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            salida[conteo[(arr[i] / exp) % 10] - 1] = arr[i];
            conteo[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = salida[i];
        }
    }

    static void radix(int arr[], int n) {
        int maximo = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }

        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos:");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radix(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scn.close();
    }
}
