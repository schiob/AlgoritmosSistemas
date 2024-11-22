import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] words = scanner.nextLine().split(" ");

        mergeSort(words, 0, words.length - 1);

        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }

    // Método de ordenación Merge Sort 
    public static void mergeSort(String[] array, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;

            // Divide 
            mergeSort(array, izq, medio);
            mergeSort(array, medio + 1, der);

            // Venceras
            merge(array, izq, medio, der);
        }
    }

    public static void merge(String[] array, int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;

        String[] izqArray = new String[n1];
        String[] derArray = new String[n2];

        //Array Temporal
        for (int i = 0; i < n1; i++) {
            izqArray[i] = array[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derArray[j] = array[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = izq;
        while (i < n1 && j < n2) {
            if (izqArray[i].compareTo(derArray[j]) <= 0) {
                array[k] = izqArray[i];
                i++;
            } else {
                array[k] = derArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = izqArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = derArray[j];
            j++;
            k++;
        }
    }
}

