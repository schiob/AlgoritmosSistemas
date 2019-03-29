/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author DEVORA
 */
public class Tarea2 {
    public static void insertion(int[] x){
        
        for (int i = 1; i <x.length; i++) {
           int temp=x[i];
           int j=i-1;
                while(j>=0 && x[j]<temp){
                    x[j+1]=x[j];
                    j=j-1;
                }
                x[j+1]=temp;
        }
        for (int i = 0; i <x.length; i++) {
            System.out.print(" "+x[i]);
           
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Declare el numero de hamburguesas a calificar");
        int numHamburgruesas=s.nextInt();
        System.out.println("Declare la calificacion de cada una en una linea");
        String extraLine=s.nextLine();
        String calificacion=s.nextLine();
        String[] hamburguesas=calificacion.split(" ");
        if(numHamburgruesas==hamburguesas.length)
            insertion(conversor(hamburguesas));
        else
            System.err.println("El Numero de hamburguesas no coincide con el num de calificaciones");
    }
    
    public static int[] conversor(String[] x){
        int[] enteros=new int[x.length];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i]=Integer.parseInt(x[i]);
        }
        return enteros;
    }
}
