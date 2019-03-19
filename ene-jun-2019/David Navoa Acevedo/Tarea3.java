/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;

/**
 *
 * @author DEVORA
 */
public class Tarea3 {
     public static void seleccion(String[] x){
       int aux=0,temp=0;
       String temp2=null;
       //division del arreglo a un arreglo de Strings y uno de enteros
       String[] a=new String[x.length/2];
       int[] b=new int[x.length/2];
         for (int i = 0; i < x.length; i++) {
             if ((i+1%2)==0) {
               b[i]=Integer.parseInt(x[i]);  
             }
             a[i]=x[i];
         }
         //inicio del selectionSort
        for (int i = 0; i <x.length; i++) {
            aux=i;
            temp=b[i];
            temp2=a[i];
                for (int j = x.length; j > i+1; j--) {
                    if (temp<b[i]) {
                        temp=b[j];
                        temp2=a[j];
                        aux=j;
                        
                    }
                b[aux]=b[i];
                a[aux]=a[i];
                a[i]=temp2;
                b[i]=temp;
            }
        }
        //union de los strings y los enteros en el arreglo base
         for (int i = 0; i <x.length; i++) {
             if ((i+1%2==0)) {
                x[i]=String.valueOf(b[i]);
             }else{
                x[i]=a[i];
             }
         }
    }
     
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0;
        String comida;
        System.out.println("Declare la cantidad de objetos a ordenar y despues de un enter"
        +" declare cada objeto seguido de un enter");
        n=s.nextInt();
        n*=2;
        comida=s.nextLine();
        String[] items=new String[n];
        try{
            for (int i = 0; i < items.length; i++) {
                items=s.nextLine().split(" ");
            }
        }catch(Exception e){
            System.out.println("Excediste el numero de objetos declarado");
        }
        seleccion(items);
        for (String a:items) {
            System.out.println(a);
        }
    }
}
