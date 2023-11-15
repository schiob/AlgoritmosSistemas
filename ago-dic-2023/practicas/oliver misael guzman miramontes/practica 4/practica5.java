import java.util.Arrays;

public class OrdenarDinosauriosMergeSort {
    public static void main(String[] args) {
       
        String[] dinosaurios = {"Tyrannosaurus", "Stegosaurus", "Velociraptor", "Brachiosaurus"};
        mergeSort(dinosaurios, 0, dinosaurios.length - 1);

        for (String dinosaurio : dinosaurios) {
            System.out.print(dinosaurio + " ");
        }
    }

    public static void mergeSort(String[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            
            int medio = (izquierda + derecha) / 2;

           
            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);
            merge(arr, izquierda, medio, derecha);
        }
    }

    public static void merge(String[] arr, int izquierda, int medio, int derecha) {
        
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        String[] izq = Arrays.copyOfRange(arr, izquierda, izquierda + n1);
        String[] dere = Arrays.copyOfRange(arr, medio + 1, medio + 1 + n2);

        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {
            if (izq[i].length() <= dere[j].length()) {
                arr[k] = izq[i];
                i++;
            } else {
                arr[k] =dere[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = izq[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = dere[j];
            j++;
            k++;
        }
    }
}
