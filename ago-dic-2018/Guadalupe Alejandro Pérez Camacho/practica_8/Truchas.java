/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Truchas {
    public static  Integer adj[][];
    public static boolean flag=false;
    public static  int visit[],n,e,ultimo;
    public static void main(String[]args){
        long inicio = System.currentTimeMillis();
        //creo la lista de adyacencia con una mtrís de tipo Integer para que sus casillas se inicialicen con null
        Scanner s=new Scanner(System.in);
        //System.out.println("estanques, riachuelos");
        String st=s.nextLine();
        //divido el string para usar cada numero individualmente
        String temp []=st.split(" ");
        //declaro arrays de visit y desde y las variables para corral caminos y donde está betsy
        n=Integer.parseInt(temp[0]); 
        e=Integer.parseInt(temp[1]);
        //le doy las dimenciones a la lista de adyacencia(matriz) y a los arrays
        adj=new Integer[n][n];
        visit=new int[n];
        
        /*desde=new int[n];
        //creo la cola para recorrer el grafo
        //inicializo desde en -1 ecepto la casilla 0
        for (int i = 1; i < n; i++) {
            desde[i]=-1;
        }*/
        
        //se llena la lista de adyacencia(matriz)
        for (int i = 0; i < e; i++) {
            st=s.nextLine();
            temp=st.split(" ");
            int j=0,a=Integer.parseInt(temp[0]),b=Integer.parseInt(temp[1]);
            while (adj[a][j]!=null) {
                j++;
            }
            adj[a][j]=b; j=0;
            j=0;
        }
        System.out.println(Arrays.deepToString(adj).replaceAll("],", "]," + System.getProperty("line.separator")));
        //el recorrido del grafo es desde el nodo 0
        DFS(0);
        if (flag==true) {
            System.out.println("Hay problemas Bob");
        }
        else System.out.println("Todo bien");
        
    }
    public static void DFS(int y){
        ultimo=y;
        //System.out.println("ultimo 1 "+ultimo);
        if (visit[y]!=1) {
            visit[y]=1;
            int x=0;
            while (adj[y][x]!=null) {
                //System.out.println(Arrays.toString(visit));
                //System.out.println(adj[y][x]);
                //desde[adj[y][x]]=y;
                //System.out.println(Arrays.toString(desde));
                DFS(adj[y][x]);
                x++;
            }
        }
        System.out.println(y +" "+ ultimo);
        if (visit[ultimo]==1&&y>ultimo) {
            flag=true;
        }
    }
}
