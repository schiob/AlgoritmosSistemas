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
public class OrdiParteUno 
{
    public static void quickSort(int[] vector, int izquierda, int derecha, String[] vectors) 
    {
        int pivote = vector[izquierda];
        String pivotes = vectors[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        String auxs;
        
        while (i < j) 
        {
            while (vector[i] >= pivote && i < j) 
            {
                i++;
            }
            
            while (vector[j] < pivote) 
            {
                j--;
            }
            
            if (i < j) 
            {
                auxIntercambio = vector[i];
                auxs = vectors[i];
                vector[i] = vector[j];
                vectors[i] = vectors[j];
                vector[j] = auxIntercambio;
                vectors[j] = auxs;
            }
        }
        
        vector[izquierda] = vector[j];
        vectors[izquierda] = vectors[j];
        vector[j] = pivote;
        vectors[j] = pivotes;
        
        if (izquierda < j - 1) 
        {
            quickSort(vector, izquierda, j - 1, vectors);
        }
        
        if (j + 1 < derecha) 
        {
            quickSort(vector, j + 1, derecha, vectors);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        boolean bandera = true;
        
        String ndeayuda = s.nextLine();
        
        int numerodetareas = Integer.parseInt(ndeayuda);
        
        while(bandera == true)
        {
            if(numerodetareas >= 1 && numerodetareas <= 500)
            {
                bandera = false;
            }
            else
            {
                System.out.println("No la vas a armar wey");
            }
        }
        
        System.out.println("");//solo se pasa un espacio por estetica
        
        String [] tareas = new String[numerodetareas];
        
        int [] numdeimportancia = new int[numerodetareas];
        
        for (int i = 0; i < numerodetareas; i++) 
        {
            String tareaycalificación = s.nextLine();
            
            String aux2[] = tareaycalificación.split(" ");
            
            tareas[i] = aux2[0];
             
            numdeimportancia[i] = Integer.parseInt(aux2[1]);
        }
        
        OrdiParteUno.quickSort(numdeimportancia, 0, numdeimportancia.length - 1, tareas);
        
        for (int i = 0; i < tareas.length; i++) 
        {
            System.out.println(tareas[i]);
        }
        
        
    }
}
