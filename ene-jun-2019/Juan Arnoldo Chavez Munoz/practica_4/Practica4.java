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
public class Practica4 {
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
    
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Numero de palabras a ingresar:");
        int num=s.nextInt();
        s.nextLine(); //Para que entre al sig. nextLine
          System.out.println("Ingresa las palabras que quieres ordenar:");
          String palabras = s.nextLine();
           String[] palabras2 = palabras.split(" ");
System.out.println(Arrays.toString(merge(palabras2)));
    }
    /*    //Para que la cantidad de palabras ingresada sea igual al numero:  
    String [] lista= new String [num];     
               
       System.out.println("Dime las palabras que vas a ordenar");  se cambian las lineas desde aqui
        for (int i = 0; i <num; i++) {
            String palabras = s.nextLine();
        lista[i]=palabras;
        }
        System.out.println("Las palabras ordenadas son: ");
System.out.println(Arrays.toString(merge(lista)));   */
}

