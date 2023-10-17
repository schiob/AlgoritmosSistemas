//PRIMER EXAMEN PARCIAL | ALGORITMOS DE ORDENAMIENTO Y BUSQUEDA
//MERCEDES A MENDOZA 

package Parcial1.Examenparcial;
 import java.util.Scanner;

public class OrdenarMedicamento {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // numero de palabras
        System.out.println("Ingresa numero de medicamentos:");
        int n = s.nextInt();
        s.nextLine();

        // palabras divididas por espacio y almacenadas en el arreglo
        System.out.println("Ingresa el nombre del medicamento separado por espacio:");
        String[] palabras = s.nextLine().split(" ");

        insertionSort(palabras);

        // imprimir losta ordenada
        System.out.println("Palabras Ordenadas alfabeticamente");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
        s.close();
    }

    public static void insertionSort(String[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }
}
