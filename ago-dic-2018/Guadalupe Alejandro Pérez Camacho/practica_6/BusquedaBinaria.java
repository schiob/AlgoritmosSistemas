/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.*;
/**
 *
 * @author Acer
 */
public class BusquedaBinaria {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String [] ss=s.nextLine().split(" ");
        int n=Integer.parseInt(ss[0]);
        String b=ss[1];
        String a [] = new String[n];
        ss=s.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            a [i] = ss[i];
        }
        System.out.println(busquedaBinaria(a,b,0,a.length));
    }
    public static int busquedaBinaria(String a[],String n,int Low,int High){
        if (High < Low)
            return -1; //Caso base. No se encuentra el elemento
        else {
            int middle = (Low+High) / 2;
            if (n.compareTo(a[middle])<0&&n.length()<a[middle].length())
                return busquedaBinaria(a, n, Low, middle-1);
            else if (n.compareTo(a[middle])>0&&n.length()>a[middle].length())
                return  busquedaBinaria(a, n, middle + 1, High);
            else
                return middle+1;  //Case base. Posicion del elemento
        }
    }
}
