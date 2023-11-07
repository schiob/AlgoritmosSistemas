package parcial_2.Ejercicio2;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("N cantidad : ");
        int num=s.nextInt();
        int[] numeros = new int[num];
        s.nextLine();

        String[] n = s.nextLine().split(" ");
        for (int i = 0; i<num; i++){
            numeros[i]=Integer.parseInt(n[i]);
        }

        radixSort(numeros,num);
        System.out.println(Arrays.toString(numeros));
    }

    static void radixSort(int[] numeros, int n) {
        int m = obtenerMax(numeros, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            Conteo(numeros, n, exp);
        }
    }

    static int obtenerMax(int[] numeros, int n) {
        int mx = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > mx) {
                mx = numeros[i];
            }
        }
        return mx;
    }

    static void Conteo(int[] numeros, int n, int exp) {
        int[] entrada = new int[n];
        int[] cont = new int[10];
        Arrays.fill(cont, 0);

        for (int i = 0; i < n; i++) {
            cont[(numeros[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            cont[i] += cont[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            entrada[cont[(numeros[i] / exp) % 10] - 1] = numeros[i];
            cont[(numeros[i] / exp) % 10]--;
        }

        System.arraycopy(entrada, 0, numeros, 0, n);
    }
}
