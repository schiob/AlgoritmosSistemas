import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Cantidad de numeros para el array: ");
        int n = s.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Ingrese los números del arreglo uno por uno:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        
        selectionSort(array);
        
        System.out.println("Arreglo ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        s.close();
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int posicionMin = i;
            
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[posicionMin]) {
                    posicionMin = j;
                }
            }

            int temp = array[posicionMin];
            array[posicionMin] = array[i];
            array[i] = temp;
        }
    }
}

