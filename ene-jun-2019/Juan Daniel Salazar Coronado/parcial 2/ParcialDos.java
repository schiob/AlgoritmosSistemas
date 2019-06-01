/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author salaz
 */

/**Segundo Parcial - Ordenando y buscando
Rabin tiene un problema. Le encanta la música, y tiene una playlist (algo rabinesco) con sus canciones favoritas. Pero cuando quiere poner una canción en especial tarda mucho tiempo buscándola y eso significa menos tiempo disfrutando y bailando.

Como quieres ayudarlo le propones ordenar esa lista de canciones por orden alfabético y luego aplicar algún algoritmo de búsqueda para encontrar las canciones que quiera.

Realiza ese programa para decirle a Rabin cómo quedaría su playlist ordenada y la nueva posición de las canciones que te pida.

Input
La entrada será recibida por STDIN

La primera linea tiene dos enteros N y Q, el número de canciones en la playlist de Rabin y el número de peticiones que hará.

La segunda linea tiene N palabras separadas por espacio representando las canciones en su playlist.

Luego hay Q lineas con una palabra cada una. Estas son las canciones que está buscando Rabin.

Output
Imprime a salida estandar STDOUT.

En la primera linea el nuevo orden de la playlist de Rabin.

Luego imprime Q lineas, cada una con el índice de la posición de la canción que busca Rabin en esa petición.

Ejemplos
Entrada
8 4
FiestaDeLocos Matador Comprendes,Mendes? PadreNuestro YoTomo Frijolero SiSeñor Imagina
SiSeñor
Imagina
PadreNuestro
Matador
Salida
Comprendes,Mendes? FiestaDeLocos Frijolero Imagina Matador PadreNuestro SiSeñor YoTomo
6
3
5
4
Notas
Resuelve el problema con merge sort y la búsqueda con el algoritmo que prefieras (binary search es más óptimo porque ya está ordenado ;) ) . Cuando termines llévale el código al profe para que te lo revise. */

public class ParcialDos 
{
    public static String[] merge(String[] arr)
    {
        if(arr.length > 1)
        {
            int x = arr.length/2;
            String[] a = Arrays.copyOfRange(arr, 0, x);
            String[] b = Arrays.copyOfRange(arr, x, arr.length);
            return sort(merge(a), merge(b));
        }
        
        return arr;
    }


    public static String[] sort(String[]a, String[]b)
    {
        String[] arr = new String[(a.length + b.length)];
        int i = 0, j = 0, k = 0;
        
        while(i< a.length && j < b.length)
        {
            if(a[i].compareTo(b[j]) <= 0)
            {
                arr[k] = a[i];
                i++;
            }
            else
            {
                arr[k] = b[j];
                j++;
            }
            
            k++;
        }
        
        while(i < a.length)
        {
            arr[k] = a[i];
            i++; 
            k++;
        }
        
        while(j < b.length)
        {
            arr[k] = b[j];
            j++;
            k++;
        }
        
        return arr;
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
     
        String playbusc = s.nextLine();
        
        String playbusc2[] = playbusc.split(" ");
        
        int [] playbusc3 = new int[playbusc2.length];
        
        for (int i = 0; i < playbusc3.length; i++) 
        {
            playbusc3[i] = Integer.parseInt(playbusc2[i]);
        }
        
        String canciones = s.nextLine();
        
        String canciones2[] = canciones.split(" ");
        
        String[] cancionesabuscar = new String[playbusc3[1]];
        
        for (int i = 0; i < cancionesabuscar.length; i++) 
        {
            cancionesabuscar[i] = s.nextLine();
        }
        
        System.out.println("");//para que se vea mejors
        
        System.out.println(Arrays.toString(merge(canciones2)));
        
        for (int i = 0; i < cancionesabuscar.length; i++) 
        {
            System.out.println(binarysearch(merge(canciones2), cancionesabuscar[i], 0, canciones2.length-1));
        }
        
    }
}
