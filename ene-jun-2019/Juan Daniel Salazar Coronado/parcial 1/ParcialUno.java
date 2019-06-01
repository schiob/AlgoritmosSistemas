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

/**Primer Parcial - Ordenando
A Juan le gustan mucho los dinosaurios y los nombres tan extraños que pueden tener, algunos de esos nombres pueden ser muy largos, como Pachycephalosaurus, Manuel tiene una lista con nombres de dinosaurios y quiere ordenarla de los nombres más cortos a los más largos.

Ayuda a Manuel haciendo un programa que haga eso.

Input
La entrada será recibida por STDIN

Consiste en una linea que tiene nombres de dinosaurios separados por un espacio.

Output
Imprime a salida estandar STDOUT, la lista de los dinosaurios ordenados de más corto a más largo.

Ejemplos
Entrada
Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus
Salida
Minmi Troodon Oviraptor Wannanosaurus Parasaurolophus
Notas
Resuelve el problema haciendo una implementación del algoritmo de ordenamiento que te haya indicado el profesor. Cuando termines llévale el código para que te lo revise. */

public class ParcialUno 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dime los nombres de los dinosaurios");
        String nombresdedinosaurios = s.nextLine();
        
        String[] partes = nombresdedinosaurios.split(" ");
        int[] n = new int[partes.length];
        String ayuda;
        int contador;
        
        for (int i = 0; i < partes.length; i++) 
        {
            ayuda = partes[i];
            contador = ayuda.length();
            n[i] = contador;
        }
        
        int temp;
        String temps;
        
        for (int i = 0; i < n.length; i++) //Ordenamiento
        {   
            for ( int j = 1; j < n.length - i  ; j++) 
            {
                if(n[j-1] > n[j])
                {
                    temp = n[j-1];
                    temps = partes[j-1];
                    
                    n[j-1] = n[j];
                    partes[j-1] = partes[j];
                    
                    n[j] = temp;
                    partes[j] = temps;
                }
            }      
        }
        
        System.out.println("");//pase de linea
        
        System.out.println("Estos son los nombres de los dinosaurios de los que tienen más letras a los que tienen menos");
        
        for(int i = 0; i < partes.length; i++) 
        {
            System.out.print(partes[i] + " ");
        }
        
    }
}
