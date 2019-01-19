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
public class Practica5 {
    static String [] palabras;
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        palabras = new String[Integer.parseInt(s.nextLine())];
        String [] ss=s.nextLine().split(" ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i]=ss[i];
        }
        MSL(0,palabras.length);
        System.out.println(Arrays.toString(palabras));
        
    }
    public static  void MSL(int primero, int ultimo){
        int i,j;
        if(ultimo > 1){
            i= ultimo/2;
            j= ultimo-i;
            MSL(primero,i);
            MSL(primero+i,j);
            merge(primero,i,j);
        }
    }
    private static  void merge(int primero, int i, int j) {
        String aux[]=new String[i+j];
        int temp=0,temp1=0,temp2=0;
        while(temp1<i && temp2<j){
            if(palabras[primero + temp1].compareToIgnoreCase(palabras[primero + i+temp2])<0&&palabras[primero + temp1].length()<palabras[primero + i+temp2].length()){
                aux[temp++] = palabras[primero + (temp1++)];	}
            else
                aux[temp++] = palabras[primero + i + (temp2++)];  
        }	
        while(temp1 < i){
            aux[temp++] = palabras[primero + (temp1++)];	
        }
        while(temp2 < j){
            aux[temp++] = palabras[primero + i + (temp2++)];
        }
        for(int k=0;k<i+j;k++){
            palabras[primero+k]=aux[k];
        }
    }
}
