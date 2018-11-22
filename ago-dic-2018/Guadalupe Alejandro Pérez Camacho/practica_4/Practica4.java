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
public class Practica4 {
    static Libros [] libros;
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        libros=new Libros[Integer.parseInt(s.nextLine())];
        for (int i = 0; i < libros.length; i++) {
            String[]ss=s.nextLine().split(" ");
            libros[i]=new Libros(ss[0],Integer.parseInt(ss[1]));
        }
        MSL(0,libros.length);
        for (int i = 0; i < libros.length; i++) {
            System.out.print(libros[i].getTitulo()+" ");
        }
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
        Libros aux[]=new Libros[i+j];
        int temp=0,temp1=0,temp2=0;
        while(temp1<i && temp2<j){
            if(libros[primero + temp1].getPages() < libros[primero + i+temp2].getPages())
                aux[temp++] = libros[primero + (temp1++)];	
            else
                aux[temp++] = libros[primero + i + (temp2++)];  
        }	
        while(temp1 < i){
            aux[temp++] = libros[primero + (temp1++)];	
        }
        while(temp2 < j){
            aux[temp++] = libros[primero + i + (temp2++)];
        }
        for(int k=0;k<i+j;k++){
            libros[primero+k]=aux[k];
        }
    }
}
