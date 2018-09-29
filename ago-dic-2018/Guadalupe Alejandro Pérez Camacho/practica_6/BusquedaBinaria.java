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
        String a [] = {"a","a12","b2","text2","text2a","text2a2","text2a12"};
        String b;
        int n;
        System.out.println("Numero de palabras");
        n=Integer.parseInt(s.next());
        System.out.println("Palabra a buscar");
        b=s.next();
        busquedaBinaria(a,b,n);
    }
    public static void busquedaBinaria(String x [],String y, int z){
        String a []=x;
        String b=y;
        int start=0,end=z-1,mid=0;
        boolean found=false;
        while (found!=true&&start<=end) {
            mid=(int)((start+end)/2);
            System.out.println(mid+" "+start+" "+end);
            if (b.compareTo(a[mid])==0) {
                found=true;
            }
            else{
                if (b.compareTo(a[mid])<0) {
                    end=mid;
                }
                if (b.compareTo(a[mid])>0) {
                    start=mid;
                }
            }
        }
        if (b.compareTo(a[z-1])==0) {
            found=true;
        }
        if (found==true) {
            System.out.println(mid+1);
        }
        if (found==false) {
            System.out.println(-1);
        }
    }
}
