
import java.util.Scanner;

// Java implementation of ShellSort
public class practica7 {

    /* Una función de utilidad para imprimir matrices de tamaño n*/
    public static void imprimirArreglo(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /* para ordenar arr usando shellSort */
    public int sort(int arr[]) {
        int n = arr.length;

        // Comienza con una gran brecha, luego reduce la brecha
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Hacer una ordenación de inserción de huecos para este tamaño de hueco.
            // Los primeros elementos a[0..gap-1] ya están
            // en orden de hueco seguir añadiendo un elemento más
            // hasta que todo el array esté ordenado por huecos
            for (int i = gap; i < n; i += 1) {
                // añadir a[i] a los elementos que se han abierto
                // ordenados guardar a[i] en temp y hacer un hueco en
                // posición i
                int temp = arr[i];

                // Desplazar hacia arriba los elementos anteriores ordenados en hueco hasta
                // se encuentre la ubicación correcta de a[i]
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // poner temp (el original a[i]) en su lugar correcto
                // ubicación correcta
                arr[j] = temp;
            }
        }
        return 0;
    }

    // Método del conductor
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        String pinturas = s.nextLine();
        String[] idpintura = pinturas.split("\\s+");

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(idpintura[i]);
        }
        System.out.println("ID de pinturas");
        imprimirArreglo(arr);

        practica7 ob = new practica7();
        ob.sort(arr);

        System.out.println("ID De pinturas ordenadas");
        imprimirArreglo(arr);
    }
}
