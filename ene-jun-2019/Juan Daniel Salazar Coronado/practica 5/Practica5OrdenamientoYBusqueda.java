/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.Scanner;

/**
 *
 * @author salaz
 */
public class Practica5OrdenamientoYBusqueda 
{
    private static void quickSortString(String[] a, int inicio, int fin)
{
        int i = inicio;
        
        int j = fin;

        // Solo checa arreglos de 2 o más elementos
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
            
            quickSortString(a, inicio, j - 1);
            
            quickSortString(a, j + 1, fin);
        }
    }
    
    private static void swap(String[] a, int i, int j)
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
    }
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dime el numero de palabras en tu lista y la palabra que buscas (separados por espacio)");
        String numypal = s.nextLine();
        
        String numypal2[] = numypal.split(" ");
        
        System.out.println("");//solo para que cambie de linea
        
        System.out.println("Introduce las palabras en tu lista separadas por espacio");
        String palabras = s.nextLine();
        
        String palabras2[] = palabras.split(" ");
        
        quickSortString(palabras2, 0, palabras2.length-1);
        
        System.out.println("");//solo para que cambie de linea
        
        System.out.println("Palabras ordenadas :");
        
        for (int i = 0; i < palabras2.length; i++)//solo las imprime para poder observar donde queda tu palabra y confirmar que el indice es correcto
        {
            System.out.print(palabras2[i] + " ");
        }
        
        System.out.println("");//con este se quita de la misma linea donde se imprime el arreglo ordenado
        System.out.println("");//con este deja una linea en blanco para que se vea más estetico
        
        System.out.println("Tu palabra esta en el indice: " + binarysearch(palabras2, numypal2[1], 0, palabras2.length-1));
        
    }
}
