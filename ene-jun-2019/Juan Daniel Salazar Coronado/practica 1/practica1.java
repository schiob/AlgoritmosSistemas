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
public class practica1 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        
        System.out.println("Introduzca el primer numero de la suma");
        n1 = s.nextInt();
        
        System.out.println("Introduzca el segundo numero de la suma");
        n2 = s.nextInt();
        
        n3 = n1 + n2;
        
        System.out.println("Su numero es: " + n3);
        
    }
}
