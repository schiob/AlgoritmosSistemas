
import static algoritmos.QuickSort.ImprimirVector;
import static algoritmos.QuickSort.Quicksort;
import java.util.Scanner;


public class practica6 {
    public static void main(String[] args) {
        Scanner l = new  Scanner(System.in);
        
        //cuantos libros son
        int n = l.nextInt();
        String s[] = new String [n];
        int arr [] = new int [n];
        int oro [] = new int [n];
        int plata[] = new int [n];
        int bronce[] = new int [n];
        String arrS [] = new String [n];
        String h = l.nextLine();
        for (int i = 0; i < arr.length; i++) {
                    s[i] = l.nextLine();
        String [] part = s[i].split("\\s+");
    arrS[i] = part[0];
    oro[i] = Integer.parseInt(part[1]);
    plata[i] = Integer.parseInt(part[2]);
    bronce[i] = Integer.parseInt(part[3]);
        }
     Quicksort(oro, 0, oro.length - 1);
     Quicksort(plata, 0, plata.length - 1);
     Quicksort(bronce, 0, bronce.length - 1);

        //Metodo para imprimir Vector Ordenado
        ImprimirVector(oro);
             ImprimirVector(plata);
                  ImprimirVector(bronce);
        
    }
    
    public static void Quicksort(int numeros[], int izq, int der) {
        /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/

        //Se toma como pivote el primer valor
        int pivote = numeros[izq];

        //Se definen los dos lados y un auxiliar
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

        numeros[izq] = numeros[j];
        numeros[j] = pivote;

        if (izq < j - 1) {
            Quicksort(numeros, izq, j - 1);
        }

        if (j + 1 < der) {
            Quicksort(numeros, j + 1, der);
        }
    }

    public static void ImprimirVector(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    
}
