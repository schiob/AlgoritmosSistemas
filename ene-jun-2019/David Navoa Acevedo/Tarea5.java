/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;
public class Tarea5 {
    public static void quick(String[] x,int iz,int der){
        if (iz<der) {
           int temp = sort(x,iz,der);
           quick(x,iz,temp-1);
           quick(x,temp+1,der);
        }
    }
    private static int sort(String[] x, int iz, int der){
        String pivote = x[der];
        int i = (iz-1);
        
        for (int j = iz; j <der; j++) {
            if (x[j].compareTo(pivote) <= 0) {
                i++;
                String temp =x[i];
                x[i]=x[j];
                x[j]=temp;
            }
        }
        String temp=x[i+1];
        x[i+1]=x[der];
        x[der]=temp;
        return i+1;
    }
    public static int BinarySearch(String[] x,int izq, int der,String dato){
        if (x[0] == dato) {
            return 0;
        }
        if (der >= izq) {
            int mitad = izq + (der - 1) / 2;
            int res = x[mitad].compareTo(dato);
            if (res == 0) { 
                return mitad;
            }
            if (res > 0) { 
                return BinarySearch(x, 1, mitad - 1, dato);
            }
            return BinarySearch(x, mitad + 1, der, dato);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el tamaño y la palabra a buscar");
        String tamaño = s.next();
        String buscar = s.next();
        System.out.println("Introdusca las palabras");
        String primeraLinea = s.nextLine();
        String palabra = s.nextLine();
        String[] palabras = palabra.split(" ");
        if (Integer.parseInt(tamaño) == palabras.length) {
            quick(palabras, 0, palabras.length - 1);
            int resu = BinarySearch(palabras, 0, palabras.length - 1, buscar);
            System.out.println(resu);
        }
        else {
            System.out.println("El tamaño de palabras no coincide con el num de palabras introducidas");
        }
    }
}
