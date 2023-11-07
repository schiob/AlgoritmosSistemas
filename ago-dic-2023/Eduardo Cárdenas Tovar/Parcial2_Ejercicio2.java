import java.util.Arrays;
import java.util.Scanner;

public class Parcial2_Ejercicio2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n\nLISTA SIN ORDENAR\n " + Arrays.toString(numeros));

        radixSort(numeros);

        System.out.println("\n\nLISTA ORDENADA DE MENOR A MAYOR: " + Arrays.toString(numeros));

    }

    public static void radixSort(int[] arr) {
        int maximo = obtenerMaximo(arr);

        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            int n = arr.length;
            int[] salida = new int[n];
            int[] cuenta = new int[10];

            Arrays.fill(cuenta, 0);

            for (int i = 0; i < n; i++) {
                cuenta[(arr[i] / exp) % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                cuenta[i] += cuenta[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                salida[cuenta[(arr[i] / exp) % 10] - 1] = arr[i];
                cuenta[(arr[i] / exp) % 10]--;
            }

            System.arraycopy(salida, 0, arr, 0, n);
        }
    }

    private static int obtenerMaximo(int[] arr) {
        int maximo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }
}
