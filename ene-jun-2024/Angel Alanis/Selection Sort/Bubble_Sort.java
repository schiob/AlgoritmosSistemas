
public class Bubble_Sort {
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
            System.out.println("Arreglo ordenado:");
            printArray(arr);
        }
    
        // Función para imprimir un arreglo
        static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        // Función para realizar el Bubble Sort
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    // Si el elemento actual es mayor que el siguiente
                    // elemento, entonces intercambiarlos
                    if (arr[j] > arr[j + 1]) {
                        // Intercambiar arr[j] y arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    