//SEGUNDO PARCIAL ALGORITMOS DE ORDENAMIENTO Y BUSQUEDA
//MERCEDES ADAMARI MENDOZA ALVARADO | ISC 
package Parcial2.Examenparcial;
import java.util.Scanner;

public class OrdenarAutosQuickSort {
    
    
    public static void quickSort(String[][] array, int inicio, int fin) {
        if (inicio < fin) {
            int piv = division(array, inicio, fin);//realiza la divisioon del arreglo eligiendo pivote

            quickSort(array, inicio, piv - 1);
            quickSort(array, piv + 1, fin);
        }
    }//end quicksort

    public static int division(String[][] array, int inicio, int fin) {
        int pivote = Integer.parseInt(array[fin][1]);
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (Integer.parseInt(array[j][1]) >= pivote) {
                i++;

                String[] temp = array[i];//intercambia arr i a j
                array[i] = array[j];
                array[j] = temp;
            }
        }
            
        String[] temp = array[i + 1]; //intercambia arr i+1 a jfin
        array[i + 1] = array[fin];
        array[fin] = temp;

        return i + 1;
    }//end particion

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("cantidad de autos:");
        int n = s.nextInt();
        System.out.println("nombre y kilometraje separado por espacio:");
        String[][] autos = new String[n][2];

        for (int i = 0; i < n; i++) {
            autos[i][0] = s.next();
            autos[i][1] = s.next();
        }

        quickSort(autos, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(autos[i][0] + " ");
        }
        
    }//end main
}//end
