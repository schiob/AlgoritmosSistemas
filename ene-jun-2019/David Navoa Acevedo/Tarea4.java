/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Arrays;
import java.util.Scanner;
public class Tarea4 {
    
    public static String[] merge(String[] x){
        if (x.length>1) {
            int z=x.length/2;
            String[] a=Arrays.copyOfRange(x,0,z);
            String[] b=Arrays.copyOfRange(x, z, x.length);
            return sort(merge(a),merge(b));
            
        }
        return x;
    }
    private static String[] sort(String[] a,String[] b){
        String[] resultado=new String[(a.length+b.length)];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i].compareTo(b[j])<0 || a[i].compareTo(b[j])==0) {
                resultado[k]=a[i];
                i++;
                k++;
            }
            else 
            {
                resultado[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            resultado[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            resultado[k]=b[j];
            k++;
            j++;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        
            System.out.println("Cuantas palabras deseas ordenar?");
            n = s.nextInt();
            System.out.println("Declare las palabras seguidas de un espacio cada una");
            String[] palabras = new String[n];
            String temp = s.nextLine(); // Esta es la Linea del numero de palabras
            String palabra=s.nextLine();
            palabras=palabra.split(" ");
            if(n == palabras.length){
                palabras = merge(palabras);
                for(String a: palabras){
                System.out.print(a+" ");
            }
            }
            else 
                System.out.println("La cantidad de palabras no coincide");
    }
}
