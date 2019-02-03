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
public class F250119 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insertion sort");
        
        System.out.println("¿Cuantos hamburguesas calificaste?");//Se pide los numeros que se van a ordenar
        int n = s.nextInt();
        
        int[] numdehamburguesas = new int[n];
        
        int temp;
        
        System.out.println("Ingrese las calificaciones de las hamburguesas que calificaste");//Se ingresan los numeros
        
        for (int i = 0; i < n; i++) 
        {
            numdehamburguesas[i] = s.nextInt();
        }
        
        for (int i = 1; i < numdehamburguesas.length; i++) //Ordenamiento
        {
            temp = numdehamburguesas[i];
            int j = 0;
            
            for ( j = i-1; j > -1 && numdehamburguesas[j] < temp  ; j--) 
            {
                numdehamburguesas[j+1] = numdehamburguesas[j];
            }
            
            numdehamburguesas[j+1] = temp;
        }
        
        System.out.println("Estas son las calificaciones ordenadas de mayor a menor: ");
        
        for (int i = 0; i < numdehamburguesas.length; i++) //Se imprimen
        {
            System.out.println(numdehamburguesas[i]);
        }
    }
}
