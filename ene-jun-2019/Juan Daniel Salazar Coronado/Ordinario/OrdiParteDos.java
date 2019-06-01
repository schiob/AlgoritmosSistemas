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
public class OrdiParteDos 
{
    
   private static int binarysearch(int[] arr, int n, int s, int f) 
    {
        if(f >= s) 
        {
            int p = s + (f - s) / 2;
            int x = arr[p];
            if (x == n) 
            {
                return p;
            } 
            else if(x<n) 
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
        
        String numeroyarticulo = s.nextLine();
        
        String aux[] = numeroyarticulo.split(" ");
        
        int numerodearticulos = Integer.parseInt(aux[0]);
        
        String articuloabuscar = aux[1];
        
        System.out.println("");//solo se pasa un espacio por estetica
        
        String [] articulos = new String[numerodearticulos];
        
        int [] precios = new int[numerodearticulos];
        
        for (int i = 0; i < numerodearticulos; i++) 
        {
            String articuloyprecio = s.nextLine();
            
            String aux2[] = articuloyprecio.split(" ");
            
            articulos[i] = aux2[0];
             
            precios[i] = Integer.parseInt(aux2[1]);
        }
        
        //Ordenamiento-------------------------------------------------------------------------------------------------------------------------------------
        
        int temp;
        String temps = "";
        
        for (int i = 1; i < precios.length; i++) //Ordenamiento
        {
            temp = precios[i];
            temps = articulos[i];
            int j;
            
            for ( j = i-1; j > -1 && precios[j] > temp  ; j--) 
            {
                precios[j+1] = precios[j];
                articulos[j+1] = articulos[j];
            }
            
            precios[j+1] = temp;
            articulos[j+1] = temps;
        }
        
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------
        
        int contador = 0;
        
        for (int i = 0; i < articulos.length; i++) 
        {
            if(articuloabuscar.compareTo(articulos[i]) == 0)
            {
                contador = i;
                break;//se sale por que ya lo encontró
            }
        }
        
        int precioabuscar = precios[contador];
        
        System.out.println( binarysearch(precios, precioabuscar, 0, precios.length) + 1 );
        
    }
}
