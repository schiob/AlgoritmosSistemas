/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosorden;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arnold
 */
public class Practica_5 {

     private static void QuickSortString(String[] a, int inicio, int fin) //Algoritmo QuickSort con Strings
{
        int i = inicio;
        int j = fin;

        
        if (j - i >= 1)
        {
            String pivote = a[i];

            while (j > i)
            {

                while (a[i].compareTo(pivote) <= 0 && i < fin && j > i)
                {
                    i++;
                }

                while (a[j].compareTo(pivote) >= 0 && j > inicio && j >= i)
                {
                    j--;
                }

                if (j > i)
                    swap(a, i, j);
            }

            swap(a, inicio, j);

            QuickSortString(a, inicio, j - 1);

            QuickSortString(a, j + 1, fin);
        }
    }
     private static void swap(String[] a, int i, int j)
    {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
     
      private static int binarysearch(String[] arr, String n, int s, int f) //Binary Search con Strings
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
    }
      
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ingrese el numero de palabras y después la palabra a buscar: "); 
       int num = s.nextInt();
        s.nextLine(); //pasa de linea para que entre al sig. nextLine
        String pal=s.nextLine(); //palabra a buscar
        System.out.println("Ingrese las palabras dentro de la lista: ");
        String palabras = s.nextLine();
        String[] palabras2 = palabras.split(" "); //Crea un array con las diferentes palabras ingresadas
        System.out.println(num +" "+ pal); 
        System.out.println(Arrays.toString(palabras2)); //Muestra la lista de palabras en el array
        
        QuickSortString(palabras2, 0,palabras2.length-1); //Ordena el array con QuickSort
        // System.out.println(Arrays.toString(palabras2)); Muestra la lista de palabras ya ordenadas
  
          int results=0;
    for (int i = 0; i < palabras2.length; i++)
{
    results = binarysearch(palabras2, pal, 0, palabras2.length-1);
    if (results >= 0) {
        System.out.println(pal + " está en el indice " + (results+1));
        break;
    }
    else {
        System.out.println(results);
        break;
    }
}
    }
    
}
