import java.util.Scanner;

public class OrdenarColoresQuickSort {
	/**
     * Método para ordenar un array usando Quick Sort.
     * arr El array de enteros a ordenar.
     * low El índice inicial del subarray.
     * high El índice final del subarray.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi es el índice de partición, arr[pi] está en la posición correcta
            int pi = partition(arr, low, high);

            // Ordenar los elementos antes y después de la partición
            quickSort(arr, low, pi - 1);  // Subarray izquierdo
            quickSort(arr, pi + 1, high); // Subarray derecho
        }
    }

    /**
     * Método para colocar el pivot en la posición correcta y organizar el array
     * de manera que los elementos menores estén a la izquierda y los mayores a la derecha.
     * arr El array de enteros.
     * low El índice inicial del subarray.
     * high El índice final del subarray (pivot).
     * La posición final del pivot.
     */
    public static int partition(int[] arr, int low, int high) {
        // El pivot se elige como el último elemento del subarray
        int pivot = arr[high];
        int i = (low - 1); // Índice del elemento más pequeño

        // Recorrer el array y reorganizar los elementos en relación con el pivot
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivot
            if (arr[j] <= pivot) {
                i++;
                // Intercambiar arr[i] con arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar el pivot (arr[high]) con el elemento en arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Devolver el índice del pivot
        return i + 1;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leer el número de colores
		System.out.print("Numero de colores e ID de colores: ");
        int n = Integer.parseInt(scanner.nextLine());

        // Leer los ids de los colores como una línea de texto y dividirla en partes
        String[] entrada = scanner.nextLine().split(" ");
        int[] ids = new int[n];
        
        // Convertir los ids de tipo String a enteros y almacenarlos en un array
        for (int i = 0; i < n; i++) {
            ids[i] = Integer.parseInt(entrada[i]);
        }

        // Ordenar los ids usando Quick Sort
        quickSort(ids, 0, n - 1);
        
        System.out.print("Arreglo Ordenado: ");
        // Imprimir los ids ordenados en una sola línea
        for (int i = 0; i < n; i++) {
            // Imprimir los números con un espacio, sin agregar un espacio al final
            System.out.print(ids[i] + (i < n - 1 ? " " : ""));
        }

        scanner.close();

	}

}
