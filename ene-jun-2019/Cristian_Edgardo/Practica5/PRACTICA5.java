package practica5;
import java.util.Scanner;
/**
 *
 * @author kryz4
 */
public class Practica5 {
    private static void quickSortString(String[] a, int COMIENZO, int FINAL)
{
        int i = COMIENZO;
        int j = FINAL;
        if (j - i >= 1)
        {
            String pivote = a[i];
            while (j > i)
            {
                while (a[i].compareTo(pivote) <= 0 && i < FINAL && j > i)
                {
                    i++;
                }
                while (a[j].compareTo(pivote) >= 0 && j > COMIENZO && j >= i)
                {
                    j--;
                }
                if (j > i)
                    aux(a, i, j);
            }
            aux(a, COMIENZO, j);
            quickSortString(a, COMIENZO, j - 1);
            quickSortString(a, j + 1, FINAL);
        }
    }
    private static void aux(String[] a, int i, int j)
    {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static int binarysearch(String[] arr, String n, int s, int f) 
    {
        if(f >= s) 
        {
            int p = s + (f - s) / 2;
            String x = arr[p];
            if (x.compareTo(n) == 0) 
            {
                return p;
            } 
            else if(x.compareTo(n) < 0)
            {
                return binarysearch(arr, n, p+1, f);
            } 
            else 
            {
                return binarysearch(arr, n, s, p-1);
            }
        }
        return -1;
    }   public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("INGRESA EL NUMERO DE PALABRAS Y LA QUE VAS A BUSCAR SEPERADAS POR ESPACIO");
        String numypal = s.nextLine();
        String numypal2[] = numypal.split(" ");
        System.out.println("");
        System.out.println("INTRODUCE LAS PALABRAS CON ESPACIO PORFAVOR");
        String palabras = s.nextLine();
        String palabras2[] = palabras.split(" ");
        quickSortString(palabras2, 0, palabras2.length-1);
        System.out.println("");
        System.out.println("PALABRAS YA ORDENADAS:");
        for (int i = 0; i < palabras2.length; i++)
        {
            System.out.print(palabras2[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("RICARDO TU PALABRA ESTA EN ESTA POSICION: " + binarysearch(palabras2, numypal2[1], 0, palabras2.length-1));

    }
    
}