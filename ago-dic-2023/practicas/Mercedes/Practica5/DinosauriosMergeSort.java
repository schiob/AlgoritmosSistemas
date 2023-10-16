
package Parcial1;
import java.util.Scanner;


public class DinosauriosMergeSort {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Ingresa nombres de los dinosaurios
        System.out.println("Ingresa el nombre de los dinosaurios por espacio ");
        String inputLine = s.nextLine();
        String[] dinosaurios = inputLine.split(" ");

        ordenarDinosaurios(dinosaurios, 0, dinosaurios.length - 1);


        for (String dino : dinosaurios) {
            System.out.print(dino + " ");
        }

        s.close();
    }//end main

    public static void ordenarDinosaurios(String[] array, int izq, int der) {
        if (izq < der) {
            int mitad = (izq + der) / 2;

            // Dividir en dos mitades
            ordenarDinosaurios(array, izq, mitad);
            ordenarDinosaurios(array, mitad + 1, der);

            // Combinar las mitades
            merge(array, izq, mitad, der);
        }
    }//emd ordenar

    public static void merge(String[] array, int izq, int mitad, int der) {
        int n1 = mitad - izq + 1;
        int n2 = der - mitad;

        String[] izqArr = new String[n1];
        String[] derArr = new String[n2];

        // copiar arrayay temporal
        for (int i = 0; i < n1; i++) {
            izqArr[i] = array[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derArr[j] = array[mitad + 1 + j];
        }

        // combinar las mitades
        int i = 0, j = 0;
        int k = izq;

        while (i < n1 && j < n2) {
            if (izqArr[i].length() <= derArr[j].length()) {
                array[k] = izqArr[i];
                i++;
            } else {
                array[k] = derArr[j];
                j++;
            }
            k++;
        }

        // copiar elem de izq y der
        while (i < n1) {
            array[k] = izqArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = derArr[j];
            j++;
            k++;
        }
        
    }//end merge
}//end programa


